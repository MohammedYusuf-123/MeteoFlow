package com.devcosmosstudio.meteoflow.network

import com.devcosmosstudio.meteoflow.model.Weather
import com.devcosmosstudio.meteoflow.util.Constants
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface WeatherApi {
    @GET(value = "data/2.5/forecast/daily")
    suspend fun getWeather(
        @Query(value = "q") query: String,
        @Query(value = "units") units: String = "imperial",
        @Query(value = "appid") appid: String = Constants.API_KEY
    ): Weather
}