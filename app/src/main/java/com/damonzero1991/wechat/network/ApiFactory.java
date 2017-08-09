package com.damonzero1991.wechat.network;

/**
 * Created by damonzero1991 on 17/8/9.
 * Des:
 */

public class ApiFactory {
    private static final String MOVIE = "MOVIE" ;
    public static ApiService create(String tag){
        switch (tag){
            case MOVIE :
               return MovieApi.getInstance().getApiService();
            default:
                return null;
        }
    }
}
