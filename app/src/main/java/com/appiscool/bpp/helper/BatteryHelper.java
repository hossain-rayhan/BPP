package com.appiscool.bpp.helper;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;

/**
 * Created by Mukla dot C on 1/20/2016.
 */
public class BatteryHelper {
    Context context;

    IntentFilter iFilter;
    Intent batteryStatus;
    int status;

    public BatteryHelper(Context ctx) {
        context = ctx;
        initialize(context);
    }

    private void initialize(Context context){
         iFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
         batteryStatus = context.registerReceiver(null, iFilter);
         status = batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
    }


    public String getBatteryStatus() {

        if (status == BatteryManager.BATTERY_STATUS_CHARGING) {
            int chargePlug = batteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
            if (chargePlug == BatteryManager.BATTERY_PLUGGED_AC) {
                return "CHARGING_AC";
            } else if (chargePlug == BatteryManager.BATTERY_PLUGGED_USB) {
                return "CHARGING_USB";
            } else {
                return "CHARGING_UNKNOWN_SOURCE";
            }
        } else if (status == BatteryManager.BATTERY_STATUS_NOT_CHARGING) {
            return "NOT_CHARGING";
        } else if (status == BatteryManager.BATTERY_STATUS_FULL) {
            return "FULL";
        } else {
            return "UNKNOWN";
        }
    }

    public float getBatteryLevel() {
        int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);

        float batteryPct = level / (float) scale;
        return batteryPct*100;
    }
}
