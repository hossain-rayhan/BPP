package com.appiscool.bpp.helper;

import android.content.Context;
import android.location.LocationManager;

/**
 * Created by Mukla dot C on 1/28/2016.
 */
public class GPSHelper {

    Context context;
    LocationManager manager;

    public GPSHelper(Context ctx) {
        context = ctx;
        initialize(context);
    }

    private void initialize(Context context) {
        manager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);

    }

    public boolean isGPSOn() {
        if (!manager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            return true;
        } else {
            return false;
        }
    }
}
