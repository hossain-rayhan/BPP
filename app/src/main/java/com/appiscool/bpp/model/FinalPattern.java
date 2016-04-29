package com.appiscool.bpp.model;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by Mukla dot C on 1/26/2016.
 */
public class FinalPattern {
    @DatabaseField
    public String day;

    @DatabaseField
    public String startTime;

    @DatabaseField
    public int totalTime;

    @DatabaseField
    public String location;

    @DatabaseField
    public double locationLat;

    @DatabaseField
    public double locationLong;

    @DatabaseField
    public float batteryLevelStart;

    @DatabaseField
    public float batteryLevelEnd;

    @DatabaseField
    public int totalChargingTime;

    @DatabaseField
    public int avgNoOfApplications;

    @DatabaseField
    public float avgCPULoad;

    @DatabaseField
    public float avgOperatingFrequency;

    @DatabaseField
    public float avgBrightnessLevel;

    @DatabaseField
    public float avgScreenTimeOut;

    @DatabaseField
    public float totalInteractionTime;

    @DatabaseField
    public int avgVolumeRing;

    @DatabaseField
    public int avgVolumeMusic;

    @DatabaseField
    public int avgVolumeAlarm;

    @DatabaseField
    public int avgVolumeVoiceCall;

    @DatabaseField
    public int totalBluetoothTime;

    @DatabaseField
    public int totalGPSTime;

    @DatabaseField
    public int totalWiFiTime;

    @DatabaseField
    public int totalMobileDataOn;

    @DatabaseField
    public float totalDataUploaded;

    @DatabaseField
    public float totalDataDownloaded;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public float getBatteryLevelStart() {
        return batteryLevelStart;
    }

    public void setBatteryLevelStart(float batteryLevelStart) {
        this.batteryLevelStart = batteryLevelStart;
    }

    public float getBatteryLevelEnd() {
        return batteryLevelEnd;
    }

    public void setBatteryLevelEnd(float batteryLevelEnd) {
        this.batteryLevelEnd = batteryLevelEnd;
    }

    public int getTotalChargingTime() {
        return totalChargingTime;
    }

    public void setTotalChargingTime(int totalChargingTime) {
        this.totalChargingTime = totalChargingTime;
    }

    public int getAvgNoOfApplications() {
        return avgNoOfApplications;
    }

    public void setAvgNoOfApplications(int avgNoOfApplications) {
        this.avgNoOfApplications = avgNoOfApplications;
    }

    public float getAvgCPULoad() {
        return avgCPULoad;
    }

    public void setAvgCPULoad(float avgCPULoad) {
        this.avgCPULoad = avgCPULoad;
    }

    public float getAvgOperatingFrequency() {
        return avgOperatingFrequency;
    }

    public void setAvgOperatingFrequency(float avgOperatingFrequency) {
        this.avgOperatingFrequency = avgOperatingFrequency;
    }

    public float getAvgBrightnessLevel() {
        return avgBrightnessLevel;
    }

    public void setAvgBrightnessLevel(float avgBrightnessLevel) {
        this.avgBrightnessLevel = avgBrightnessLevel;
    }

    public float getAvgScreenTimeOut() {
        return avgScreenTimeOut;
    }

    public void setAvgScreenTimeOut(float avgScreenTimeOut) {
        this.avgScreenTimeOut = avgScreenTimeOut;
    }

    public float getTotalInteractionTime() {
        return totalInteractionTime;
    }

    public void setTotalInteractionTime(float totalInteractionTime) {
        this.totalInteractionTime = totalInteractionTime;
    }

    public int getAvgVolumeRing() {
        return avgVolumeRing;
    }

    public void setAvgVolumeRing(int avgVolumeRing) {
        this.avgVolumeRing = avgVolumeRing;
    }

    public int getAvgVolumeMusic() {
        return avgVolumeMusic;
    }

    public void setAvgVolumeMusic(int avgVolumeMusic) {
        this.avgVolumeMusic = avgVolumeMusic;
    }

    public int getAvgVolumeAlarm() {
        return avgVolumeAlarm;
    }

    public void setAvgVolumeAlarm(int avgVolumeAlarm) {
        this.avgVolumeAlarm = avgVolumeAlarm;
    }

    public int getAvgVolumeVoiceCall() {
        return avgVolumeVoiceCall;
    }

    public void setAvgVolumeVoiceCall(int avgVolumeVoiceCall) {
        this.avgVolumeVoiceCall = avgVolumeVoiceCall;
    }

    public int getTotalBluetoothTime() {
        return totalBluetoothTime;
    }

    public void setTotalBluetoothTime(int totalBluetoothTime) {
        this.totalBluetoothTime = totalBluetoothTime;
    }

    public int getTotalGPSTime() {
        return totalGPSTime;
    }

    public void setTotalGPSTime(int totalGPSTime) {
        this.totalGPSTime = totalGPSTime;
    }

    public int getTotalWiFiTime() {
        return totalWiFiTime;
    }

    public void setTotalWiFiTime(int totalWiFiTime) {
        this.totalWiFiTime = totalWiFiTime;
    }

    public int getTotalMobileDataOn() {
        return totalMobileDataOn;
    }

    public void setTotalMobileDataOn(int totalMobileDataOn) {
        this.totalMobileDataOn = totalMobileDataOn;
    }

    public float getTotalDataUploaded() {
        return totalDataUploaded;
    }

    public void setTotalDataUploaded(float totalDataUploaded) {
        this.totalDataUploaded = totalDataUploaded;
    }

    public float getTotalDataDownloaded() {
        return totalDataDownloaded;
    }

    public void setTotalDataDownloaded(float totalDataDownloaded) {
        this.totalDataDownloaded = totalDataDownloaded;
    }
}
