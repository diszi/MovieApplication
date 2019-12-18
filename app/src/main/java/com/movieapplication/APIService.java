package com.movieapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {


    @GET("3/search/movie?api_key=d243e02fe7382c503c90edea8d0dbc21&language=en-US&query=GET&page=1&include_adult=false")
    Call<Result> getMovies();

//    @GET("3/movie/{id}?api_key=d243e02fe7382c503c90edea8d0dbc21&language=en-US&query=GET&page=1&include_adult=false")
//    Call<Movie> getMovieByID(@Path("id") int id);

}
