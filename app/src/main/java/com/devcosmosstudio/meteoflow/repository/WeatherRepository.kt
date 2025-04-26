package com.devcosmosstudio.meteoflow.repository

import android.util.Log
import com.devcosmosstudio.meteoflow.data.DataOrException
import com.devcosmosstudio.meteoflow.model.Weather
import com.devcosmosstudio.meteoflow.network.WeatherApi
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val api: WeatherApi) {
    suspend fun getWeather(cityQuery: String): DataOrException<Weather, Boolean, Exception> {
        val response = try {
            api.getWeather(query = cityQuery)
        } catch (e: Exception){
            Log.d("Rex", "getWeather: $e")
            return DataOrException(e = e)
        }
        Log.d("INSIDE", "getWeather: $response")
        return DataOrException(data = response)
    }
}