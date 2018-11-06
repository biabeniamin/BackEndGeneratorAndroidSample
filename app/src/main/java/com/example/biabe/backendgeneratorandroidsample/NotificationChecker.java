package com.example.biabe.backendgeneratorandroidsample;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

public class NotificationChecker extends IntentService {

    private void sendNotification(String msg) {

        NotificationManager mNotificationManager = (NotificationManager)

                this.getSystemService(Context.NOTIFICATION_SERVICE);



        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,

                new Intent(this, MainActivity.class), 0);



        NotificationCompat.Builder mBuilder =

                new NotificationCompat.Builder(this)

                        .setSmallIcon(R.drawable.if_heart_1055045)

                        .setContentTitle("PubNub GCM Notification")

                        .setStyle(new NotificationCompat.BigTextStyle()

                                .bigText(msg))

                        .setContentText(msg);



        mBuilder.setContentIntent(contentIntent);

        mNotificationManager.notify(1, mBuilder.build());

    }
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        while (true)
        {
            try {
                sendNotification("dsfgds");
                wait(3000);
            }
            catch (InterruptedException e)
            {

            }
        }
    }

    public NotificationChecker(String name)
    {
        super(name);
    }
}
