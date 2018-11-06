package com.example.biabe.backendgeneratorandroidsample;


import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.biabe.DatabaseFunctionsGenerator.Models.User;
import com.example.biabe.DatabaseFunctionsGenerator.UserAdapter;
import com.example.biabe.DatabaseFunctionsGenerator.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);

        final ListView listView = (ListView) findViewById(R.id.listView);

        Users.getUsers(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                List<User> users = response.body();
                listView.setAdapter(new UserAdapter(users,getApplicationContext()));
                //Toast.makeText(MainActivity.this, "not error", Toast.LENGTH_LONG).show();

                //List<User> test=Users.getUsersByUsernamePassword("Test2", "Test");
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error", Toast.LENGTH_LONG).show();
            }
        });

        //start notification system
        Intent msgIntent = new Intent(this, NotificationChecker.class);
        startService(msgIntent);

    }
    public void OnClick(View view)
    {


        //if you want to add a user synchronous and you don't want to get an answer from server
        //Users.addUser(new User());//create a user with default data

        //if you want to add a user asynchronous and you want to display the result in ui, you can pass a callback to method
        Users.addUser(new User(), new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(0 != response.body().getUserId()) {
                    Toast.makeText(MainActivity.this, "The user was added", Toast.LENGTH_LONG).show();

                    //it should also be added to list view
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this, "The user adding failed!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
