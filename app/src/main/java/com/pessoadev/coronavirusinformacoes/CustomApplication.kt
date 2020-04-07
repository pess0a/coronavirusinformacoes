package com.pessoadev.coronavirusinformacoes

import android.app.Application
import com.pessoadev.coronavirusinformacoes.di.AppModule
import com.pessoadev.coronavirusinformacoes.di.NetworkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CustomApplication  : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CustomApplication)
            modules(listOf(AppModule,NetworkModule))
        }
    }
}