package com.example.mymovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MoviesRepository.getPopularMovies(
            onSuccess = ::onPopularMoviesFetched,
            onError = ::onError
        )
    }
    private fun onPopularMoviesFetched(movies: List<Movie>) {
        Log.d("MainActivity", "Movies: $movies")
    }

    private fun onError() {
        Toast.makeText(this,getString(R.string.error_fetch_movies),Toast.LENGTH_LONG).show()
    }

        //alternativamente
        /*MoviesRepository.getPopularMovies(
            onSuccess = { movies ->
                Log.d("MainActivity", "Movies: $movies")
            },
            onError = {
                Toast.makeText(this,getString(R.string.error_fetch_movies),Toast.LENGTH_LONG).show()
            }
        )*/

}