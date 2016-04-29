package com.appiscool.bpp.helper;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.provider.Settings;
import android.util.Log;

/**
 * Created by Mukla dot C on 1/19/2016.
 */
public class Helper {

    Context context;
    public Helper(Context ctx){
        context = ctx;
    }

    public float getScreenBrightness(){
        try {
            float curBrightnessValue = android.provider.Settings.System.getInt(
                    context.getContentResolver(), android.provider.Settings.System.SCREEN_BRIGHTNESS);
            return curBrightnessValue;

        } catch (Settings.SettingNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }
    public float getScreenTimeoutValue(){
        try {
            float screenTimeOut = android.provider.Settings.System.getInt(
                    context.getContentResolver(), Settings.System.SCREEN_OFF_TIMEOUT);
            return screenTimeOut;

        } catch (Settings.SettingNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }

   public boolean isBluetoothOn(){
       BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
       if (bluetoothAdapter == null) {
           return false;
       } else {
           if (bluetoothAdapter.isEnabled()) {
               return true;
           } else {
               return false;
           }
       }
   }

}
