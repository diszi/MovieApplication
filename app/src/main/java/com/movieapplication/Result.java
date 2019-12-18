package com.movieapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("results")
    private List<Movie> movieList;

    @SerializedName("total_pages")
    private Integer pages;


    public List<Movie> getMovieList() {
        return movieList;
    }


    public Integer getPages(){
        return pages;
    }
}
