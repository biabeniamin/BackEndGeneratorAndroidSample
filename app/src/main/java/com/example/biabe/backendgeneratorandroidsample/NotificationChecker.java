package com.example.biabe.backendgeneratorandroidsample;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;

import com.example.biabe.DatabaseFunctionsGenerator.Models.Notification;
import com.example.biabe.DatabaseFunctionsGenerator.Notifications;
import com.example.biabe.DatabaseFunctionsGenerator.Users;

import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NotificationChecker extends IntentService {
    private Date lastNotification;
    private void sendNotification(String msg) {

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, "1")
                .setSmallIcon(R.drawable.visa)
                .setContentTitle("sgsd")
                .setContentText(msg)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

// notificationId is a unique int for each notification that you must define
        notificationManager.notify(1, mBuilder.build());

    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {


        lastNotification = new Date(0);

        while (true)
        {
            synchronized (this) {
                try {
                    Notifications.getNotifications(new Callback<List<Notification>>() {
                                                       @Override
                                                       public void onResponse(Call<List<Notification>> call, Response<List<Notification>> response) {
                                                           List<Notification> notifications = response.body();

                                                           if(0 < notifications.size()) {
                                                               int last = notifications.size() - 1;

                                                               if(lastNotification.before(notifications.get(last).getCreationTime())) {

                                                                   sendNotification(notifications.get(last).getTitle());
                                                                   lastNotification = notifications.get(last).getCreationTime();
                                                               }
                                                           }
                                                       }

                                                       @Override
                                                       public void onFailure(Call<List<Notification>> call, Throwable t) {

                                                       }
                                                   });

                    wait(3000);
                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        }
    }


    public NotificationChecker()
    {
        super("Service");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //Log.d(MyIntentServiceActivity.TAG_INTENT_SERVICE, "MyIntentService onCreate() method is invoked.");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
