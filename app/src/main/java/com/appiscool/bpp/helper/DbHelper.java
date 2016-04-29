package com.appiscool.bpp.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.appiscool.bpp.model.FinalPattern;
import com.appiscool.bpp.model.UsagePattern;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mukla dot C on 1/23/2016.
 */
public class DbHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "UsagePatternDb.sqlite";
    private static final int DATABASE_VERSION = 1;
    private Context context;

    private Dao<UsagePattern, Integer> usagePatternDao = null;
    private Dao<FinalPattern, Integer> finalPatternDao = null;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, UsagePattern.class);
            TableUtils.createTable(connectionSource, FinalPattern.class);
        } catch (SQLException e) {
            Log.e(DbHelper.class.getName(), "Can't create database", e);
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        List<String> allSql = new ArrayList<String>();
        try {
            /*TableUtils.dropTable(connectionSource, Donor.class,true);
            TableUtils.createTable(connectionSource, Donor.class);
            CSVToDbHelper.readCSVAndInserIntoDb(context, R.raw.donor, DbTableName.Donor);*/
            for (String sql : allSql) {
                sqLiteDatabase.execSQL(sql);
            }
        } catch (Exception e) {
            Log.e(DbHelper.class.getName(), "exception during onUpgrade", e);
            throw new RuntimeException(e);
        }
    }

    public Dao<UsagePattern, Integer> getUsagePatternDao() {
        if (null == usagePatternDao) {
            try {
                usagePatternDao = getDao(UsagePattern.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return usagePatternDao;
    }

    public Dao<FinalPattern, Integer> getFinalPatternDao() {
        if (null == finalPatternDao) {
            try {
                finalPatternDao = getDao(FinalPattern.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return finalPatternDao;
    }

}

