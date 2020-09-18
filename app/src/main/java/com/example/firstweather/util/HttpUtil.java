package com.example.firstweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 工具类，利用Okhttp进行网络数据的交互
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
