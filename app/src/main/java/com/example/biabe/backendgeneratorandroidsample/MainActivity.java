package com.example.biabe.backendgeneratorandroidsample;


import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
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

    private void createNotification(String msg) {


        CharSequence name = "safas";
        String description = "hdfhdfhdf";
        int importance = NotificationManager.IMPORTANCE_DEFAULT;
        NotificationChannel channel = new NotificationChannel("1", name, importance);
        channel.setDescription(description);
        // Register the channel with the system; you can't change the importance
        // or other notification behaviors after this
        NotificationManager notificationManager = getSystemService(NotificationManager.class);
        notificationManager.createNotificationChannel(channel);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);


        //start notification system
        Intent msgIntent = new Intent(this, NotificationChecker.class);
        //startService(msgIntent);

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
    }
    public void OnClick(View view)
    {

        createNotification("safas");
        //if you want to add a user synchronous and you don't want to get an answer from server
        //Users.addUser(new User());//create a user with default data


    }
}
