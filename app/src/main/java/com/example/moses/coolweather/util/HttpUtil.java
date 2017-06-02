package com.example.moses.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by moses on 2017/5/31.
 */

public class HttpUtil {
    public static void sendOkHttplRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
