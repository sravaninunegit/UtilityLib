package com.utility.utility;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class Utility {
    public void checkAppinstalledOrNot(Context context){
        try {

            PackageInfo pInfo =   context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String version = pInfo.versionName;
            int verCode = pInfo.versionCode;
            String packageName=pInfo.packageName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
