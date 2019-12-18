package com.movieapplication;

import android.graphics.Path;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> implements Filterable {



    private List<Movie> moviesList = new ArrayList();
    private ArrayList<Movie> moviesFullList ;
    public MainActivity activity;

    MainAdapter(MainActivity activity){
        this.activity=activity;
    }

    public void setMovies(List<Movie> movies) {
        System.out.println(" set Movies");
        //this.view = activity;
        this.moviesList.clear();
        this.moviesList.addAll(movies);
        moviesFullList = new ArrayList<>(this.moviesList);
        this.notifyDataSetChanged();
        for (int i=0;i<10;i++) {
            System.out.println(" MOVIE = "+this.moviesList.get(i).getTitle());
        }
    }
    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_row,parent,false);
        return new MainAdapter.MainViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        final Movie movie = moviesList.get(position);
        holder.bind(movie);
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                activity.launchMovieDetails(movie.getId());
//            }
//        });


    }

    @Override
    public int getItemCount() {
        if (moviesList !=null && moviesList.size() >0){
            return moviesList.size();
        }else{
            return 0;
        }
    }

    @Override
    public Filter getFilter() {
        return senderFilter;
    }



    private Filter senderFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {


            ArrayList<Movie> filteredList = new ArrayList<>();
            if (constraint==null || constraint.length() == 0){
                filteredList.addAll(moviesFullList);
            }else{
                String filteredPattern  =  constraint.toString().toLowerCase();
                System.out.println(" filteredPattern = "+filteredPattern);
                for (Movie movie : moviesFullList){
                    if (movie.getTitle().toLowerCase().contains(filteredPattern)){

                        filteredList.add(movie);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            moviesList.clear();
            moviesList.addAll((ArrayList) results.values);
            notifyDataSetChanged();
        }
    };

    static class MainViewHolder extends RecyclerView.ViewHolder {



        @BindView(R.id.movie_title)
                TextView title;
        @BindView(R.id.movie_rate)
                TextView rate;

        MainViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }


        private void bind(Movie movie){
            title.setText(movie.getTitle());
            rate.setText(movie.getRate().toString());
        }


    }


}
