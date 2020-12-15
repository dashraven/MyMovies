package com.example.mymovies

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "88204a86919bbeaae767f6cd17bba56d",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}