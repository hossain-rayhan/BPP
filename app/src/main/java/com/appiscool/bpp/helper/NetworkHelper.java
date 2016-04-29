package com.appiscool.bpp.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.TrafficStats;
import android.net.wifi.WifiManager;
import android.util.Log;

import java.lang.reflect.Method;

/**
 * Created by Mukla dot C on 1/20/2016.
 */
public class NetworkHelper {
    Context context;
    WifiManager wifi;

    public NetworkHelper(Context ctx) {
        context = ctx;
        initialize(context);
    }

   private void initialize(Context context){
        wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
   }

    public boolean isWifiOn() {
        if (wifi.isWifiEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMobileDataOn() {
        boolean mobileDataEnabled = false; // Assume disabled
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        try {
            Class cmClass = Class.forName(cm.getClass().getName());
            Method method = cmClass.getDeclaredMethod("getMobileDataEnabled");
            method.setAccessible(true); // Make the method callable
            // get the setting for "mobile data"
            mobileDataEnabled = (Boolean) method.invoke(cm);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mobileDataEnabled == true ? true : false;
    }

    public long getUploadedDataSize() {
        return TrafficStats.getTotalTxBytes();
    }

    public long getDownloadedDataSize(){
        return TrafficStats.getTotalRxBytes();
    }
}
