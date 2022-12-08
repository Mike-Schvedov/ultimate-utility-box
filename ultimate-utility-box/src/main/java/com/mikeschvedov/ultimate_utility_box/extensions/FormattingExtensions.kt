package com.mikeschvedov.ultimate_utility_box.extensions

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

// Taking in a Unix time and formatting it to a date as String
@SuppressLint("SimpleDateFormat")
fun Long.fromUnixToFormatted(pattern: String = "dd/MM/yy hh:mm"): String {
    val sdf = SimpleDateFormat(pattern)
    val netDate = Date(this * 1000)
    return sdf.format(netDate)
}