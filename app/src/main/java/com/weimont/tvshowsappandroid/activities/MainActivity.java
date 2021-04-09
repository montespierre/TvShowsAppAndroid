package com.weimont.tvshowsappandroid.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.weimont.tvshowsappandroid.R;
import com.weimont.tvshowsappandroid.viewmodels.MostPopularTVShowsViewModel;

public class MainActivity extends AppCompatActivity {
    // TV Shows API
    // https://www.episodate.com/api

    private MostPopularTVShowsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MostPopularTVShowsViewModel.class);
        getMostPopularTVShows();
    }

    private void getMostPopularTVShows(){
        viewModel.getMostPopularTVShows(0).observe(this, mostPopularTVShowsResponse ->
                        Toast.makeText(
                                getApplicationContext(),
                                "Total pages: " + mostPopularTVShowsResponse.getTotalPages(),
                                Toast.LENGTH_SHORT
                        ).show()

                );
    }
}