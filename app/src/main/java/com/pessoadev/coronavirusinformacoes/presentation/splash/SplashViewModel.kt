package com.pessoadev.coronavirusinformacoes.presentation.splash

import androidx.lifecycle.MutableLiveData
import com.pessoadev.coronavirusinformacoes.base.BaseViewModel
import com.pessoadev.coronavirusinformacoes.presentation.countries.CountriesRepository
import com.pessoadev.coronavirusinformacoes.data.cache.CountriesCache
import com.pessoadev.coronavirusinformacoes.model.Country
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SplashViewModel(private val repository: CountriesRepository) : BaseViewModel() {
    val countries = MutableLiveData<MutableList<Country>>()
    val onLoadCountries = MutableLiveData<Unit>()


    fun getCountries() {
        repository.getCountries().enqueue(object : Callback<Country> {
            override fun onFailure(call: Call<Country>, t: Throwable) {
                CountriesCache.init(mutableListOf())
                t.printStackTrace()
            }

            override fun onResponse(call: Call<Country>, response: Response<Country>) {
                CountriesCache.init(response.body() as List<Country>)
                onLoadCountries.value = Unit
            }
        })
    }
}