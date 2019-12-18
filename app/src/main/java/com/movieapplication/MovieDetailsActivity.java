package com.movieapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieDetailsActivity extends AppCompatActivity {

    @BindView(R.id.movie_language)
    TextView language;
    @BindView(R.id.movie_popularity)
    TextView popularity;
    @BindView(R.id.movie_status)
    TextView status;
    @BindView(R.id.movie_overview)
    TextView overView;

    @BindView(R.id.movie_title)
    TextView title;

    private Integer movieID=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);
        ButterKnife.bind(this);

//        movieID = (Integer)getIntent().getSerializableExtra("MOVIE_ID");
//
//        System.out.println(" MOVIE ID = "+movieID);
//        getMovieDetails(movieID);

    }

    private void getMovieDetails(Integer id){
//        APIService api = RetrofitClient.getApiService();
//        Call<Movie> callMovieDetails = api.getMovieByID(id);
//        callMovieDetails.enqueue(new Callback<Movie>() {
//            @Override
//            public void onResponse(Call<Movie> call, Response<Movie> response) {
//                if (!response.isSuccessful()) {
//                    showErrorMsg("Error in loading Movie details");
//                    return;
//                }
//                Movie movie = response.body();
//                showMovieDetails(movie);
//            }
//
//            @Override
//            public void onFailure(Call<Movie> call, Throwable t) {
//
//            }
//        });

    }


    private void showMovieDetails(Movie movie){
        System.out.println(" MOVIE DETAILS [id="+movie.getId()+"; title="+movie.getTitle()+"]");
//        title.setText(movie.getTitle());
//        status.setText(movie.getStatus());
//        popularity.setText(movie.getPopularity());
//        language.setText(movie.getOriginal_lang());
//        overView.setText(movie.getOverview());
    }

    private void showErrorMsg(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

}
