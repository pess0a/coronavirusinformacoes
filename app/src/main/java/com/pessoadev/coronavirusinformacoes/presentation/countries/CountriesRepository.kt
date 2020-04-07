package com.pessoadev.coronavirusinformacoes.presentation.countries

import com.pessoadev.coronavirusinformacoes.data.CountriesService
import com.pessoadev.coronavirusinformacoes.model.Country
import retrofit2.Call

class CountriesRepository(private val api: CountriesService) {

    fun getCountries(): Call<Country> {
        return api.getCountries()
    }
}