package com.appiscool.bpp.model;

/**
 * Created by Mukla dot C on 1/29/2016.
 */
public class ProfileSettings {

    //cpuLoad & battery
    public boolean killApp;

    //interactionTime & battery
    public float screenTimeout;


    //interactionTime & battery
    public float brightness;

    //lessInteractionTime, t < 20%
    public boolean offMobileData;

    //lessInteractionTime, t < 20%
    public boolean offWifi;

    //noInterAction, t < 5%
    public boolean offGPS;

    //noInterAction, t < 5%
    public boolean offBluetooth;

    //batteryLevel < 40%
    public boolean offAudibleTouch;

    //batteryLevel < 40%
    public boolean offNotificationTune;

    //batteryLevel < 40%
    public boolean offLiveWallpaper;

    //batteryLevel < 40%
    public boolean offSensors;

    //batteryLevel < 15%
    public boolean offVibration;



    public float volumeMusic;
    public float volumeRing;
    public float volumeAlarm;


    public boolean autoSync;


}
