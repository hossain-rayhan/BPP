package com.appiscool.bpp.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.appiscool.bpp.MonitoringModuleIntentService;

public class DataCollectionReceiver extends BroadcastReceiver {
    public DataCollectionReceiver() {
    }


    @Override
    public void onReceive(Context context, Intent intent) {
        MonitoringModuleIntentService.startBuildingPattern(context);
    }
}
