package com.pessoadev.coronavirusnumbers.di

import com.pessoadev.coronavirusnumbers.presentation.countries.CountriesViewModel
import com.pessoadev.coronavirusnumbers.presentation.dashboard.general.presentation.GeneralInformationViewModel
import com.pessoadev.coronavirusnumbers.presentation.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val AppModule = module {

    viewModel { CountriesViewModel(get()) }
    viewModel { SplashViewModel(get()) }
    viewModel { GeneralInformationViewModel() }

    single { createCountriesService(get())}

    single { createCountriesRepository(get()) }


}