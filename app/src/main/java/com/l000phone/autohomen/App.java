package com.l000phone.autohomen;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2016/11/18/018.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
