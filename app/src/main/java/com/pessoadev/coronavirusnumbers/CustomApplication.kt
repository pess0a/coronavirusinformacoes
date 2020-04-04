package com.pessoadev.coronavirusnumbers

import android.app.Application
import com.pessoadev.coronavirusnumbers.di.AppModule
import com.pessoadev.coronavirusnumbers.di.NetworkModule
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