package com.movieapplication;

import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("original_title")
    private String original_title;

    @SerializedName("title")
    private String title;

    @SerializedName("id")
    private Integer id;

    @SerializedName("original_language")
    private String original_lang;

    @SerializedName("overview")
    private String overview;

    @SerializedName("vote_average")
    private Double rate;

    @SerializedName("status")
    private String status;

    @SerializedName("popularity")
    private Integer popularity;

    public Movie() {
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public String getOriginal_lang() {
        return original_lang;
    }

    public String getOverview() {
        return overview;
    }

    public Double getRate() {
        return rate;
    }

    public String getStatus() {
        return status;
    }

    public Integer getPopularity() {
        return popularity;
    }
}
