package com.pessoadev.coronavirusinformacoes.di

import com.pessoadev.coronavirusinformacoes.presentation.countries.CountriesViewModel
import com.pessoadev.coronavirusinformacoes.presentation.dashboard.general.presentation.GeneralInformationViewModel
import com.pessoadev.coronavirusinformacoes.presentation.dashboard.news.NewsViewModel
import com.pessoadev.coronavirusinformacoes.presentation.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val AppModule = module {

    viewModel { CountriesViewModel(get()) }
    viewModel { SplashViewModel(get()) }
    viewModel { GeneralInformationViewModel() }
    viewModel { NewsViewModel() }

    single { createCountriesService(get())}

    single { createCountriesRepository(get()) }


}