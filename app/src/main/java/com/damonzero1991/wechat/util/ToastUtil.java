package com.damonzero1991.wechat.util;

import android.widget.Toast;

import com.damonzero1991.wechat.WeChatApplication;

/**
 * Created by damonzero1991 on 17/8/9.
 */

public class ToastUtil {
    public static void showToast(String msg){
        Toast.makeText(WeChatApplication.application.getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }
}
