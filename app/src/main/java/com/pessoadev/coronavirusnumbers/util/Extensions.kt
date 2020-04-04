package com.pessoadev.coronavirusnumbers.util

import com.pessoadev.coronavirusnumbers.data.cache.CountriesCache
import java.text.DecimalFormat


fun Int.toDecimalFormat(): String {
    return DecimalFormat("###,###,###,###").format(this)
}