package com.pessoadev.coronavirusnumbers.presentation.countries

import com.pessoadev.coronavirusnumbers.base.BaseViewModel
import com.pessoadev.coronavirusnumbers.model.Country
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CountriesViewModel(private val repository: CountriesRepository) : BaseViewModel() {

    fun getCountries() {
        repository.getCountries().enqueue(object : Callback<Country> {
            override fun onFailure(call: Call<Country>, t: Throwable) {
                t.printStackTrace()
            }

            override fun onResponse(call: Call<Country>, response: Response<Country>) {
                val countriesList = response.body() as List<*>
                countriesList.forEach {
                    val data = it as Country
                    println(data.name)
                }
            }
        })
    }
}



