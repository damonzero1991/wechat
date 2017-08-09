package com.damonzero1991.wechat;

import android.app.Application;

/**
 * Created by damonzero1991 on 17/8/9.
 */

public class WeChatApplication extends Application {

    public static WeChatApplication application = null ;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this ;
    }
}
