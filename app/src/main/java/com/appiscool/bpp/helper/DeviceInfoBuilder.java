package com.appiscool.bpp.helper;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

import com.appiscool.bpp.model.DeviceInfo;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Mukla dot C on 1/20/2016.
 */
public class DeviceInfoBuilder {
    Context context;

    public DeviceInfoBuilder(Context ctx) {
        context = ctx;
    }

    public DeviceInfo build() {
        DeviceInfo deviceInfo = new DeviceInfo();

        TelephonyManager tManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        deviceInfo.UID = tManager.getDeviceId();

        deviceInfo.deviceName = getDeviceName();
        deviceInfo.osVersion = Build.VERSION.RELEASE;

        String cpuMaxFreq = "";
        String cpuMinFreq = "";

        try {
            RandomAccessFile reader = new RandomAccessFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", "r");
            cpuMaxFreq = reader.readLine();
            reader = new RandomAccessFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq", "r");
            cpuMinFreq = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        deviceInfo.maxFrequency = cpuMaxFreq;
        deviceInfo.minFrequency = cpuMinFreq;

        return deviceInfo;
    }

    private static String getDeviceName() {
        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;
        if (model.startsWith(manufacturer)) {
            return model;
        }
        return manufacturer + " " + model;
    }
}
