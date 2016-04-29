package com.appiscool.bpp.helper;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.content.ContextCompat;

public class LocationService {

    boolean gps_enabled = false;
    boolean network_enabled = false;
    protected LocationManager locationManager;
    Context context;

    private static final long MIN_DISTANCE_FOR_UPDATE = 100;
    private static final long MIN_TIME_FOR_UPDATE = 1000 * 60 * 60;

    public LocationService(Context ctx) {
        context = ctx;
        setUp(context);
    }

    private void setUp(Context ctx) {
        locationManager = (LocationManager) ctx.getSystemService(Context.LOCATION_SERVICE);
    }


    private Location getCurrentLocation() {
        gps_enabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        network_enabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

        Location net_loc = null, gps_loc = null, finalLoc = null;

        if (ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (gps_enabled)
                gps_loc = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if (network_enabled)
                net_loc = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        }

        if (gps_loc != null && net_loc != null) {

            if (gps_loc.getAccuracy() >= net_loc.getAccuracy())
                finalLoc = gps_loc;
            else
                finalLoc = net_loc;

            // I used this just to get an idea (if both avail, its upto you which you want to take as I taken location with more accuracy)

        } else {

            if (gps_loc != null) {
                finalLoc = net_loc;
            } else if (net_loc != null) {
                finalLoc = gps_loc;
            }
        }

        return finalLoc;
    }

}
