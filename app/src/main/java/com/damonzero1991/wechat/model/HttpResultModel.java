package com.damonzero1991.wechat.model;

/**
 * Created by damonzero1991 on 17/8/9.
 */

public class HttpResultModel<T> {

    //用来模仿resultCode和resultMessage
    private int count;
    private int start;
    private int total;
    private String title;

    //用来模仿Data
    private T subjects;

}
