package com.pessoadev.coronavirusnumbers.presentation.countries

import com.pessoadev.coronavirusnumbers.data.CountriesService
import com.pessoadev.coronavirusnumbers.model.Country
import retrofit2.Call

class CountriesRepository(private val api: CountriesService) {

    fun getCountries(): Call<Country> {
        return api.getCountries()
    }
}