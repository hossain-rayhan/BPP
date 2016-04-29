package com.appiscool.bpp.helper;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.util.Log;

import java.util.List;

/**
 * Created by Mukla dot C on 1/20/2016.
 */
public class ApplicationHelper {
    Context context;
    ActivityManager activityManager;
    List<ActivityManager.RunningAppProcessInfo> runningAppProcessInfoList;
    PowerManager powerManager;

    public ApplicationHelper(Context ctx){
        context = ctx;
        initialize(context);
    }

    private void initialize(Context mContext){
        activityManager = (ActivityManager) mContext.getSystemService(Context.ACTIVITY_SERVICE);
        runningAppProcessInfoList = activityManager.getRunningAppProcesses();
        powerManager = (PowerManager) mContext.getSystemService(Context.POWER_SERVICE);
    }


    public String getRunningApplicationNames() {
        String runningApplication = "";
        for (ActivityManager.RunningAppProcessInfo pi : runningAppProcessInfoList) {
            runningApplication = runningApplication + pi.processName + ";";
        }
        return runningApplication;
    }

    public int getTotalRunningApplication(){

        return runningAppProcessInfoList.size();
    }

    public boolean isInteractive(){
        return powerManager.isScreenOn();
    }
}
