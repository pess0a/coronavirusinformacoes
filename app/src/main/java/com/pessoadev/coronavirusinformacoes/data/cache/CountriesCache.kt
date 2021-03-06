package com.pessoadev.coronavirusinformacoes.data.cache

import com.pessoadev.coronavirusinformacoes.model.Country


class CountriesCache {
    companion object {
        private var countriesList: List<Country> = listOf()
        private var countriesCount: Int = 0
        private var countriesDeath: Int = 0
        private var countriesRecovery: Int = 0
        private var countriesInfected: Int = 0

        private var countriesCountLast24Hours: Int = 0
        private var countriesDeathLast24Hours = 0
        private var countriesRecoveryLast24Hours: Int = 0
        private var countriesInfectedLast24Hours: Int = 0

        fun init(list: List<Country>) {
            countriesList = list

            countriesList.map {
                countriesCount += 1
                countriesDeath += it.status.last().deaths
                countriesRecovery += it.status.last().recovered
                countriesInfected += it.status.last().confirmed
            }

            countriesList.map {
                val deathLastA = it.status.last().deaths
                val deathLastB = it.status[it.status.size-2].deaths

                val recoveryLastA = it.status.last().recovered
                val recoveryLastB = it.status[it.status.size-2].recovered

                val infectedLastA = it.status.last().confirmed
                val infectedLastB = it.status[it.status.size-2].confirmed

                countriesDeathLast24Hours += deathLastA - deathLastB
                countriesRecoveryLast24Hours += recoveryLastA - recoveryLastB
                countriesInfectedLast24Hours += infectedLastA - infectedLastB
            }

        }

        fun getCountriesList() = countriesList
        fun getCountriesCount() = countriesCount
        fun getCountriesDeath() = countriesDeath
        fun getCountriesRecovery() = countriesRecovery
        fun getCountriesInfected() = countriesInfected

        fun getCountriesCountLast24Hours() = countriesCountLast24Hours
        fun getCountriesDeathLast24Hours() = countriesDeathLast24Hours
        fun getCountriesRecoveryLast24Hours() = countriesRecoveryLast24Hours
        fun getCountriesInfectedLast24Hours() = countriesInfectedLast24Hours
    }
}