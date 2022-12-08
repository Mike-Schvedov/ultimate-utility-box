package com.mikeschvedov.ultimate_utility_box.extensions

import android.content.Context
import android.content.SharedPreferences

fun Context.setStringToSharedPref(value: String, name: String, prefName: String){
    val sharedPreferences: SharedPreferences =
        getSharedPreferences(prefName, Context.MODE_PRIVATE)
    sharedPreferences.edit().putString(name, value).apply()
}

fun Context.getStringFromSharedPref(name: String, prefName: String): String{
    val sharedPreferences: SharedPreferences =
        getSharedPreferences(prefName, Context.MODE_PRIVATE)
    return  sharedPreferences.getString(name, "EmptySharedPref") ?: "Error Strinjg"
}