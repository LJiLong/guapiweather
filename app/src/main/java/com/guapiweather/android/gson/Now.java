package com.guapiweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 林基隆 on 8/21 0021.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
