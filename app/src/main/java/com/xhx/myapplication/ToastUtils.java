package com.xhx.myapplication;

import android.content.Context;
import android.widget.Toast;


/**
 * 优化Toast
 * @author XingHaoxiang
 */

public class ToastUtils {

    public static final int TIME_SHORT = Toast.LENGTH_SHORT;
    public static final int TIME_LONG = Toast.LENGTH_LONG;

    private static Toast mToast;
    private static Context mContext = ToastApplication.getContext();

    public static void showToast(int resId) {
        showToast(mContext.getResources().getString(resId));
    }

    public static void showToast(String text) {
        showToast(text, TIME_SHORT);
    }

    public static void showToast(int resId, int duration) {
        showToast(mContext.getResources().getString(resId), duration);
    }

    public static void showToast(String text, int duration) {
        if (mToast == null) {
            mToast = Toast.makeText(mContext, text, duration);
        } else {
            mToast.setText(text);
        }
        mToast.show();
    }
}
