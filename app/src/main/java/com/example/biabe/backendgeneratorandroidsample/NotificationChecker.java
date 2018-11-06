package com.example.biabe.backendgeneratorandroidsample;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

public class NotificationChecker extends IntentService {


    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        while (true)
        {
            try {
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
