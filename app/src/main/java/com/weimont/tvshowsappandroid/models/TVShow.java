package com.weimont.tvshowsappandroid.models;

import com.google.gson.annotations.SerializedName;

public class TVShow {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("startDate")
    private String startDate;

    @SerializedName("country")
    private String country;

    @SerializedName("network")
    private String network;

    @SerializedName("status")
    private String status;

    @SerializedName("thumbnail")
    private String thumbnail;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getCountry() {
        return country;
    }

    public String getNetwork() {
        return network;
    }

    public String getStatus() {
        return status;
    }

    public String getThumbnail() {
        return thumbnail;
    }


}
