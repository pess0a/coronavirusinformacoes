package com.pessoadev.coronavirusinformacoes.data

import com.pessoadev.coronavirusinformacoes.model.Country
import retrofit2.Call
import retrofit2.http.GET

interface CountriesService {
        @GET("covid19/timeseries.json")
        fun getCountries() : Call<Country>
}