package com.ergasia.omada5.WhiteRabbit.Utils;

import android.net.NetworkInfo;

/**
 * Created by accel on 1/31/2017.
 */

public class MyUtils {

    public static boolean isNetOn(NetworkInfo info) {
//        ConnectivityManager manager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
//        NetworkInfo info = manager.getActiveNetworkInfo();
        if (info != null && info.isConnected()) {
            return true;
        } else {
            return false;

        }
    }





}
