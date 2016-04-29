package com.appiscool.bpp.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Mukla dot C on 1/19/2016.
 */

@DatabaseTable
public class UsagePattern
{
    @DatabaseField
    public String day;

    @DatabaseField
    public String time;

    @DatabaseField
    public String location;

    @DatabaseField
    public double locationLat;

    @DatabaseField
    public double locationLong;

    @DatabaseField
    public String batteryStatus;

    @DatabaseField
    public float batteryLevel;

    @DatabaseField
    public String runningApplications;

    @DatabaseField
    public int totalRunningApplication;

    @DatabaseField
    public float cpuLoad;

    @DatabaseField
    public float operatingFrequency;

    @DatabaseField
    public float brightnessLevel;

    @DatabaseField
    public float screenTimeOut;

    @DatabaseField
    public boolean isInterActive;

    @DatabaseField
    public int volumeRing;

    @DatabaseField
    public int volumeMusic;

    @DatabaseField
    public int volumeAlarm;

    @DatabaseField
    public int volumeVoiceCall;

    @DatabaseField
    public boolean isBluetoothOn;

    @DatabaseField
    public boolean isGPSOn;

    @DatabaseField
    public boolean isWiFiOn;

    @DatabaseField
    public boolean isMobileDataOn;

    @DatabaseField
    public float dataUploaded;

    @DatabaseField
    public float dataDownloaded;


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public double getLocationLat() {
        return locationLat;
    }

    public void setLocationLat(double locationLat) {
        this.locationLat = locationLat;
    }

    public double getLocationLong() {
        return locationLong;
    }

    public void setLocationLong(double locationLong) {
        this.locationLong = locationLong;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(String batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public float getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(float batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getRunningApplications() {
        return runningApplications;
    }

    public int getTotalRunningApplication() {
        return totalRunningApplication;
    }

    public boolean isInterActive() {
        return isInterActive;
    }

    public void setIsInterActive(boolean isInterActive) {
        this.isInterActive = isInterActive;
    }

    public void setTotalRunningApplication(int totalRunningApplication) {
        this.totalRunningApplication = totalRunningApplication;
    }

    public void setRunningApplications(String runningApplications) {
        this.runningApplications = runningApplications;
    }

    public float getCpuLoad() {
        return cpuLoad;
    }

    public void setCpuLoad(float cpuLoad) {
        this.cpuLoad = cpuLoad;
    }

    public float getOperatingFrequency() {
        return operatingFrequency;
    }

    public void setOperatingFrequency(float operatingFrequency) {
        this.operatingFrequency = operatingFrequency;
    }

    public float getBrightnessLevel() {
        return brightnessLevel;
    }

    public void setBrightnessLevel(float brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
    }

    public float getScreenTimeOut() {
        return screenTimeOut;
    }

    public void setScreenTimeOut(float screenTimeOut) {
        this.screenTimeOut = screenTimeOut;
    }

    public int getVolumeRing() {
        return volumeRing;
    }

    public void setVolumeRing(int volumeRing) {
        this.volumeRing = volumeRing;
    }

    public int getVolumeMusic() {
        return volumeMusic;
    }

    public void setVolumeMusic(int volumeMusic) {
        this.volumeMusic = volumeMusic;
    }

    public int getVolumeAlarm() {
        return volumeAlarm;
    }

    public void setVolumeAlarm(int volumeAlarm) {
        this.volumeAlarm = volumeAlarm;
    }

    public int getVolumeVoiceCall() {
        return volumeVoiceCall;
    }

    public void setVolumeVoiceCall(int volumeVoiceCall) {
        this.volumeVoiceCall = volumeVoiceCall;
    }

    public boolean isBluetoothOn() {
        return isBluetoothOn;
    }

    public void setIsBluetoothOn(boolean isBluetoothOn) {
        this.isBluetoothOn = isBluetoothOn;
    }

    public boolean isGPSOn() {
        return isGPSOn;
    }

    public void setIsGPSOn(boolean isGPSOn) {
        this.isGPSOn = isGPSOn;
    }

    public boolean isWiFiOn() {
        return isWiFiOn;
    }

    public void setIsWiFiOn(boolean isWiFiOn) {
        this.isWiFiOn = isWiFiOn;
    }

    public boolean isMobileDataOn() {
        return isMobileDataOn;
    }

    public void setIsMobileDataOn(boolean isMobileDataOn) {
        this.isMobileDataOn = isMobileDataOn;
    }

    public float getDataUploaded() {
        return dataUploaded;
    }

    public void setDataUploaded(float dataUploaded) {
        this.dataUploaded = dataUploaded;
    }

    public float getDataDownloaded() {
        return dataDownloaded;
    }

    public void setDataDownloaded(float dataDownloaded) {
        this.dataDownloaded = dataDownloaded;
    }
}
