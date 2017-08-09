package com.damonzero1991.wechat.util;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * Created by damonzero1991 on 17/8/9.
 */

public class ValueUtil {


    /**
     * 判断list是否为空
     * @param noteList
     * @return
     */
    public static boolean isListEmpty(List<?> noteList) {
        return null == noteList || noteList.size() == 0;
    }

    /**
     * 判断str是否为空
     * @param value
     * @return
     */
    public static boolean isStrEmpty(String value) {
        if (null == value || "".equals(value.trim())) {
            return true;
        }
        return false;
    }

    /**
     * 判断obj是否为空
     * @param object
     * @return
     */
    public static boolean isEmpty(Object object) {
        return null == object;
    }

    public static boolean isHasEmptyView(View... views) {
        for (View v : views) {
            if (!v.isShown()) {
                continue;
            }
            if (v instanceof EditText) {
                EditText et = (EditText) v;
                if (TextUtils.isEmpty(et.getText().toString().trim())) {
                    return true;
                }
            } else if (v instanceof TextView) {
                TextView tv = (TextView) v;
                if (TextUtils.isEmpty(tv.getText().toString().trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * boolean转String
     * @param b
     * @return
     */
    public static String bolean2String(boolean b) {
        return b ? "1" : "0";
    }
}
