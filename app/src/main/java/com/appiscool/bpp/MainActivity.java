package com.appiscool.bpp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.appiscool.bpp.helper.DbManager;
import com.appiscool.bpp.model.FinalPattern;
import com.appiscool.bpp.model.UsagePattern;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DbManager.init(getApplicationContext());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DbManager.init(this);


        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                List<UsagePattern> patternList;

                FinalPattern finalPattern = new FinalPattern();


                patternList = DbManager.getInstance().getAllUsagePattern();
                finalPattern.day = patternList.get(0).day;
                finalPattern.startTime = patternList.get(0).time;
                finalPattern.location = patternList.get(0).location;
                finalPattern.locationLat = patternList.get(0).locationLat;
                finalPattern.locationLong = patternList.get(0).locationLong;
                finalPattern.totalTime = 5 * patternList.size();
                finalPattern.batteryLevelStart = patternList.get(0).batteryLevel;
                finalPattern.batteryLevelEnd = patternList.get(patternList.size() - 1).batteryLevel;

                int totalCharging = 0;
                int totalNoOfApplication = 0;
                int totalCPULoad = 0;
                int totalOperatingFrequency = 0;
                int totalBrightnessLevel = 0;
                int totalScreenTimeout = 0;
                int totalInterActionTime = 0;
                int volumeMusic = 0;
                int volumeAlarm = 0;
                int volumeRing = 0;
                int volumeVoiceCall = 0;
                int totalBluetooth = 0;
                int totalGPS = 0;
                int totalWiFi = 0;
                int totalMobileData = 0;
                float totalDataUploaded = 0;
                float totalDataDownloaded = 0;

                for (UsagePattern p : patternList) {
                    if (p.batteryStatus.equals("CHARGING_AC") || p.batteryStatus.equals("CHARGING_USB") || p.batteryStatus.equals("CHARGING_UNKNOWN_SOURCE"))
                        totalCharging++;
                    totalNoOfApplication += p.totalRunningApplication;
                    totalCPULoad += p.cpuLoad;
                    totalOperatingFrequency += p.operatingFrequency;
                    totalBrightnessLevel += p.brightnessLevel;
                    totalScreenTimeout += p.screenTimeOut;
                    if (p.isInterActive)
                        totalInterActionTime += 5;
                    volumeAlarm += p.volumeAlarm;
                    volumeMusic += p.volumeMusic;
                    volumeRing += p.volumeRing;
                    volumeVoiceCall += p.volumeVoiceCall;
                    if (p.isBluetoothOn)
                        totalBluetooth += 1;
                    if (p.isGPSOn)
                        totalGPS += 1;
                    if (p.isWiFiOn)
                        totalWiFi += 1;
                    if (p.isMobileDataOn)
                        totalMobileData += 1;
                    totalDataUploaded += p.dataUploaded;
                    totalDataDownloaded += p.dataDownloaded;

                    Log.e("MyLog", "day " + p.day + " Time " + p.time + " Lat " + p.locationLong +
                                    " Long " + p.locationLong + " BatteryLevel " + p.batteryLevel +
                                    " dataUploaded " + p.dataUploaded + " isInterActive " + p.isInterActive
                    );


                }

                finalPattern.totalChargingTime = totalCharging * 5;
                finalPattern.avgNoOfApplications = (totalNoOfApplication / patternList.size());
                finalPattern.avgCPULoad = totalCPULoad / patternList.size();
                finalPattern.avgOperatingFrequency = totalOperatingFrequency / patternList.size();
                finalPattern.avgScreenTimeOut = totalScreenTimeout / patternList.size();
                finalPattern.avgBrightnessLevel = totalBrightnessLevel / patternList.size();
                finalPattern.totalInteractionTime = totalInterActionTime;
                finalPattern.avgVolumeAlarm = volumeAlarm / patternList.size();
                finalPattern.avgVolumeMusic = volumeMusic / patternList.size();
                finalPattern.avgVolumeRing = volumeRing / patternList.size();
                finalPattern.avgVolumeVoiceCall = volumeVoiceCall / patternList.size();
                finalPattern.totalBluetoothTime = totalBluetooth * 5;
                finalPattern.totalGPSTime = totalGPS * 5;
                finalPattern.totalWiFiTime = totalWiFi * 5;
                finalPattern.totalMobileDataOn = totalMobileData * 5;
                finalPattern.totalDataUploaded = totalDataUploaded;
                finalPattern.totalDataDownloaded = totalDataDownloaded;

                DbManager.getInstance().addFinalPattern(finalPattern);

                List<FinalPattern> finalPatterns  = DbManager.getInstance().getAllFinalPattern();
                FinalPattern p = finalPatterns.get(0);
                if(p != null){
                    Log.e("Final Pattern", "Day " + p.day + " StartTime " + p.startTime
                    +" TotalTime " + p.totalTime +" CPULoad " +p.avgCPULoad + " totalBluetooth,GPS,Wifi,MobileData" + p.totalBluetoothTime + "_"
                            +p.totalGPSTime + "_" + p.totalWiFiTime +"_"+p.totalMobileDataOn+ " Ring_Music_Alarm_VoiceCall"+
                                    + p.avgVolumeRing+"_"+p.avgVolumeMusic+"_"+p.avgVolumeAlarm+"_"+p.avgVolumeVoiceCall + " Interaction " + p.totalInteractionTime + " ScreenTimeout "+ p.avgScreenTimeOut
                            +" Brightness " + p.avgScreenTimeOut + " TotalApp " + p.avgNoOfApplications
                    );
                }else{
                    Log.e("Final Pattern", "Not Found");
                }
            }
        });
    }

}
