package com.mcal.lang;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.app.Application;

public class App extends Application {
	@SuppressLint("StaticFieldLeak")
    private static Context mContext;
    @SuppressLint("StaticFieldLeak")
    private static SharedPreferences mPreferences;

    public static Context getContext() {
        if (mContext == null) {
            mContext = new App();
        }
        return mContext;
    }

    public static SharedPreferences getPreferences() {
        if (mPreferences == null) {
            mPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        }
        return mPreferences;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
    }
}
