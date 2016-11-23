package com.l000phone.autohomen;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * Created by Administrator on 2016/11/23.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UMShareAPI.get(this);



    }

    { PlatformConfig.setQQZone("1105764245", "VLqoNsJDfa3IlkXZ");
        PlatformConfig.setSinaWeibo("3917831941", "2b5e1d9c8ce19126ba0d77f5b1743c6e");}
}
