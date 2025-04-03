package com.devcosmosstudio.meteoflow.repository

import com.devcosmosstudio.meteoflow.model.WeatherObject
import com.devcosmosstudio.meteoflow.network.WeatherApi
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val api: WeatherApi) {
    suspend fun getWeather(cityQuery: String): WeatherObject {
        
    }
}