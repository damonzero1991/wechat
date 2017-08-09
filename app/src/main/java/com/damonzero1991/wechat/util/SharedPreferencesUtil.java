package com.damonzero1991.wechat.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.damonzero1991.wechat.WeChatApplication;
import com.damonzero1991.wechat.common.Constants;

/**
 * Created by damonzero1991 on 17/8/9.
 * Des: 封装SharedPreference，只为方便调用
 */

public class SharedPreferencesUtil {

        public static int getInt(String key, int defValue) {
            SharedPreferences sharedPreferences = WeChatApplication.application.getSharedPreferences(Constants.CONFIG, Context.MODE_PRIVATE);
            return sharedPreferences.getInt(key, defValue);
        }

        public static void putInt(String key, int value) {
            SharedPreferences sharedPreferences = WeChatApplication.application.getSharedPreferences(Constants.CONFIG, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt(key, value);
            editor.commit();
        }

        public static String getString(String key, String defValue) {
            SharedPreferences sharedPreferences = WeChatApplication.application.getSharedPreferences(Constants.CONFIG, Context.MODE_PRIVATE);
            return sharedPreferences.getString(key, defValue);
        }

        public static void putString(String key, String value) {
            SharedPreferences sharedPreferences = WeChatApplication.application.getSharedPreferences(Constants.CONFIG, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(key, value);
            editor.commit();
        }

        public static boolean getBoolean(String key, boolean defValue) {
            SharedPreferences sharedPreferences = WeChatApplication.application.getSharedPreferences(Constants.CONFIG, Context.MODE_PRIVATE);
            return sharedPreferences.getBoolean(key, defValue);
        }

        public static void putBoolean(String key, boolean value) {
            SharedPreferences sharedPreferences = WeChatApplication.application.getSharedPreferences(Constants.CONFIG, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean(key, value);
            editor.commit();
        }

        public static long getLong(String key, long defValue) {
            SharedPreferences sharedPreferences = WeChatApplication.application.getSharedPreferences(Constants.CONFIG, Context.MODE_PRIVATE);
            return sharedPreferences.getLong(key, defValue);
        }

        public static void putLong(String key, long value) {
            SharedPreferences sharedPreferences = WeChatApplication.application.getSharedPreferences(Constants.CONFIG, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putLong(key, value);
            editor.commit();
        }
}
