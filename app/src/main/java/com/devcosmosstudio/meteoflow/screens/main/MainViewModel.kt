package com.devcosmosstudio.meteoflow.screens.main

import androidx.lifecycle.ViewModel
import com.devcosmosstudio.meteoflow.data.DataOrException
import com.devcosmosstudio.meteoflow.model.Weather
import com.devcosmosstudio.meteoflow.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val repository: WeatherRepository) : ViewModel() {
    suspend fun getWeatherData(city: String): DataOrException<Weather, Boolean, Exception> {
        return repository.getWeather(cityQuery = city)
    }
}