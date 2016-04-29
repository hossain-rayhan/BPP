package com.appiscool.bpp.helper;

import android.location.Location;

/**
 * Created by Mukla dot C on 1/28/2016.
 */
public interface OnLocationChangeListener {
    void onLocationChange(String provider, Location location);
}
