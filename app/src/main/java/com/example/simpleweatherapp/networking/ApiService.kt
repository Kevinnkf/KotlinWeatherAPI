package com.example.simpleweatherapp.networking

import com.example.simpleweatherapp.Model.CurrentWeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    // Get current weather data
    @GET("current.json")
    fun getCurrentWeather(
        //get API key
        @Query("key") key: String = ApiConfig.API_KEY,
        @Query("q") city: String,
        @Query("aqi") aqi: String = "no"
    ): Call<CurrentWeatherResponse>

}