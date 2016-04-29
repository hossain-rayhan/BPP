package com.appiscool.bpp.helper;

import android.content.Context;

import com.appiscool.bpp.model.FinalPattern;
import com.appiscool.bpp.model.UsagePattern;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mukla dot C on 1/23/2016.
 */

public class DbManager {
    static private DbManager instance;

    static public void init(Context ctx) {
        if (null == instance) {
            instance = new DbManager(ctx);
        }
    }

    static public DbManager getInstance() {
        return instance;
    }

    private DbHelper helper;

    private DbManager(Context ctx) {
        helper = new DbHelper(ctx);
    }

    private DbHelper getHelper() {
        return helper;
    }

    public List<UsagePattern> getAllUsagePattern() {
        List<UsagePattern> usagePatterns = new ArrayList<>();
        try {
            usagePatterns = getHelper().getUsagePatternDao().queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usagePatterns;
    }


    public void addUsagePattern(UsagePattern pattern) {
        try {
            getHelper().getUsagePatternDao().create(pattern);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addFinalPattern(FinalPattern finalPattern) {
        try {
            getHelper().getFinalPatternDao().create(finalPattern);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<FinalPattern> getAllFinalPattern() {
        List<FinalPattern> finalPatterns = new ArrayList<>();
        try {
            finalPatterns = getHelper().getFinalPatternDao().queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return finalPatterns;
    }

}
