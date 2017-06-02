package com.example.moses.coolweather.gson;

/**
 * Created by moses on 2017/6/1.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
