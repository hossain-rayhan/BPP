package com.appiscool.bpp;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;

import com.appiscool.bpp.receiver.DataCollectionReceiver;

/**
 * Created by Mukla dot C on 1/26/2016.
 */
public class BPPApplication extends Application {

    private final int REQUEST_CODE = 9999;
    @Override
    public void onCreate() {
        super.onCreate();

        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Intent intent = new Intent(this, DataCollectionReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, REQUEST_CODE, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        alarmManager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime(),1*60*1000, pendingIntent);





    }
}
