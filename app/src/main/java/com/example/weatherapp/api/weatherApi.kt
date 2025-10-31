package com.example.weatherapp.api

import retrofit2.http.GET
import retrofit2.http.Query

interface weatherApi {
    @GET("/v1/current.json")
    suspend fun getWeather(
        @Query("Key") apikey : String,
        @Query("q") city : String
    )
}