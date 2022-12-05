package com.mikeschvedov.ultimate_utility_box.interfaces.callbacks

fun interface GenericListCallback<T> {
    fun onChange(
        list: List<T>
    )
}