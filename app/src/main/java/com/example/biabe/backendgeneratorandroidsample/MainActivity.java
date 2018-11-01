package com.example.biabe.backendgeneratorandroidsample;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
