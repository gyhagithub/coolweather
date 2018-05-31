package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public Basic basic;


    public String status;


    public Update update;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
