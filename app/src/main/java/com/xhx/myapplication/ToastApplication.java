package com.xhx.myapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by Xinghx on 2016/10/10.
 */

public class ToastApplication extends Application {
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext(){
        return mContext;
    }
}
