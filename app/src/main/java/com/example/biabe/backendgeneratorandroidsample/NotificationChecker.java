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

public class NotificationChecker extends IntentService {

    private void sendNotification(String msg) {

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, "1")
                .setSmallIcon(R.drawable.visa)
                .setContentTitle("sgsd")
                .setContentText("fgj")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

// notificationId is a unique int for each notification that you must define
        notificationManager.notify(1, mBuilder.build());

    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        while (true)
        {
            synchronized (this) {
                try {
                    sendNotification("dsfgds");
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
