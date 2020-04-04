package com.pessoadev.coronavirusnumbers.util

import java.text.DateFormat
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*


fun Int.toDecimalFormat(): String {
    return DecimalFormat("###,###,###,###").format(this)
}

fun String.toBrazilianStringDate(): String {
    val formatter: DateFormat = SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", Locale.US)
    val date = formatter.parse(this) as Date
    val sdf = SimpleDateFormat("dd/MM/yyyy - HH:mm", Locale.getDefault())
    return sdf.format(date)


}