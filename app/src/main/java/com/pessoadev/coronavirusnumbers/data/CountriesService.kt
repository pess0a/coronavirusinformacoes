package com.pessoadev.coronavirusnumbers.data

import com.pessoadev.coronavirusnumbers.model.Country
import retrofit2.Call
import retrofit2.http.GET

interface CountriesService {
        @GET("covid19/timeseries.json")
        fun getCountries() : Call<Country>
}