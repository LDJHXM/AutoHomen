package com.l000phone.autohomen;

import android.app.Application;
import android.content.Context;

import com.l000phone.db.GreenDaoManager;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * Created by Administrator on 2016/11/23.
 */

public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        UMShareAPI.get(this);

        mContext = getApplicationContext();

        GreenDaoManager.getInstance();



    }

    { PlatformConfig.setQQZone("1105764245", "VLqoNsJDfa3IlkXZ");
        PlatformConfig.setSinaWeibo("3917831941", "2b5e1d9c8ce19126ba0d77f5b1743c6e");}

    public static Context getContext() {
        return mContext;
    }
}
