package com.guapiweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 林基隆 on 8/21 0021.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
