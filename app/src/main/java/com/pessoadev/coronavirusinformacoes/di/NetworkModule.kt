package com.pessoadev.coronavirusinformacoes.di

import com.google.gson.GsonBuilder
import com.pessoadev.coronavirusinformacoes.presentation.countries.CountriesRepository
import com.pessoadev.coronavirusinformacoes.data.CountriesService
import com.pessoadev.coronavirusinformacoes.data.JsonCountryAdapter
import com.pessoadev.coronavirusinformacoes.model.Country
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val NetworkModule = module {

    single { createRetrofit() }
}

fun createRetrofit(): Retrofit {
    val gson = GsonBuilder()
        .registerTypeAdapter(Country::class.java, JsonCountryAdapter())
        .create()

    return Retrofit.Builder()
        .baseUrl("https://pomber.github.io/")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
}

fun createCountriesService(retrofit: Retrofit): CountriesService {
    return retrofit.create(CountriesService::class.java)
}

fun createCountriesRepository(api: CountriesService): CountriesRepository {
    return CountriesRepository(api)
}