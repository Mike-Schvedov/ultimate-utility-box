package com.mikeschvedov.ultimate_utility_box.extensions

import android.content.Context
import android.widget.Toast

fun Context.displayToast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}