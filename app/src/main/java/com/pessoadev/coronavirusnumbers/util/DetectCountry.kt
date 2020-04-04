package com.pessoadev.coronavirusnumbers.util

import android.content.res.Resources
import android.os.Build
import java.util.*

class DetectCountry(private val resources : Resources) {

    @Suppress("DEPRECATION")
    private fun getCountry() : String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            resources.configuration.locales.get(0).country
        } else {
            resources.configuration.locale.country
        }
    }
}