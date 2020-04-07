package com.pessoadev.coronavirusinformacoes.model

data class CountriesList(val countryList : List<Country>)

data class Country(val name: String, val status: List<Status>)

data class Status(
    val date: String,
    val confirmed: Int,
    val deaths: Int,
    val recovered: Int
)