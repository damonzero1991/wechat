package com.damonzero1991.wechat.network;

import com.damonzero1991.wechat.common.Url;
import com.damonzero1991.wechat.network.movie.MovieService;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by damonzero1991 on 17/8/9.
 * Des:
 */

public class MovieApi  {

    private Retrofit retrofit;
    private  final int DEFAULT_TIMEOUT = 5;

    private MovieApi() {
        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder()
                .client(httpClientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(Url.MOVIE_BASE_URL)
                .build();
    }

    public ApiService getApiService(){
        return retrofit.create(MovieService.class);
    }

    //在访问HttpMethods时创建单例
    private static class SingletonHolder{
        private static final MovieApi INSTANCE = new MovieApi();
    }

    //获取单例
    public static MovieApi getInstance(){
        return MovieApi.SingletonHolder.INSTANCE;
    }

}
