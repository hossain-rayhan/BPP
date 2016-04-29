package com.appiscool.bpp.helper;

import android.content.Context;
import android.location.Location;

import com.appiscool.bpp.model.UsagePattern;

/**
 * Created by Mukla dot C on 1/20/2016.
 */
public class PatternHelper {
    private Context context;
    BatteryHelper batteryHelper;
    ApplicationHelper applicationHelper;
    CPUHelper cpuHelper;
    Helper helper;
    VolumeHelper volumeHelper;
    LocationHelper locationHelper;
    NetworkHelper networkHelper;
    GPSHelper gpsHelper;
    Location currentLocation;

    public PatternHelper(Context ctx) {
        context = ctx;
        intialize(context);
    }

    private void intialize(Context context) {
        batteryHelper = new BatteryHelper(context);
        applicationHelper = new ApplicationHelper(context);
        cpuHelper = new CPUHelper();
        helper = new Helper(context);
        volumeHelper = new VolumeHelper(context);
        networkHelper = new NetworkHelper(context);
        gpsHelper = new GPSHelper(context);

        locationHelper = new LocationHelper(context, new OnLocationChangeListener() {

            @Override
            public void onLocationChange(String provider, Location location) {
                currentLocation = location;
            }
        });


    }


    public void generatePattern() {
        UsagePattern usagePattern = new UsagePattern();

        usagePattern.day = SimpleDateFormatter.getCurrentDay();
        usagePattern.time = SimpleDateFormatter.getCurrentTime();
        usagePattern.batteryStatus = batteryHelper.getBatteryStatus();
        usagePattern.batteryLevel = batteryHelper.getBatteryLevel();
        usagePattern.runningApplications = applicationHelper.getRunningApplicationNames();
        usagePattern.totalRunningApplication = applicationHelper.getTotalRunningApplication();
        usagePattern.isInterActive = applicationHelper.isInteractive();
        usagePattern.cpuLoad = cpuHelper.readCPUUsage();
        usagePattern.locationLat = locationHelper.getLatitude();
        usagePattern.locationLong = locationHelper.getLongitude();
        usagePattern.brightnessLevel = helper.getScreenBrightness();
        usagePattern.screenTimeOut = helper.getScreenTimeoutValue();
        usagePattern.volumeRing = volumeHelper.getRingtoneVolume();
        usagePattern.volumeAlarm = volumeHelper.getAlarmVolume();
        usagePattern.volumeMusic = volumeHelper.getMusicVolume();
        usagePattern.volumeVoiceCall = volumeHelper.getVoiceCallVolume();
        usagePattern.isBluetoothOn = helper.isBluetoothOn();
        usagePattern.isGPSOn = gpsHelper.isGPSOn();
        usagePattern.isWiFiOn = networkHelper.isWifiOn();
        usagePattern.isMobileDataOn = networkHelper.isMobileDataOn();
        usagePattern.dataDownloaded = networkHelper.getDownloadedDataSize();
        usagePattern.dataUploaded = networkHelper.getUploadedDataSize();


        DbManager.init(context);
        DbManager.getInstance().addUsagePattern(usagePattern);
    }
}
