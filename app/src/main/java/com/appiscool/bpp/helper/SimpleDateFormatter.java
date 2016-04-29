package com.appiscool.bpp.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Mukla dot C on 1/19/2016.
 */
public class SimpleDateFormatter {

    public static String getCurrentDay() {
        DateFormat df = new SimpleDateFormat("EEE");
        String date = df.format(Calendar.getInstance().getTime());
        return date;
    }

    public static String getCurrentTime() {
        DateFormat df = new SimpleDateFormat("HH:mm");
        String date = df.format(Calendar.getInstance().getTime());
        return date;
    }

}
