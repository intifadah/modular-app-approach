package com.app.sample.utilities

import android.util.Log
import kotlin.reflect.full.createInstance

fun String.loadProductOrNull(): Product? {
    return this.loadClassOrNull<Product>()?.kotlin?.createInstance()
}

private val classMap = mutableMapOf<String, Class<*>>()

private inline fun <reified T : Any> Any.castOrNull() = this as? T

internal fun <T> String.loadClassOrNull(): Class<out T>? =
    classMap.getOrPut(this) {
        try {
            Class.forName(this)
        } catch (e: ClassNotFoundException) {
            Log.d("ClassNotFoundException", "ClassNotFoundException $this")
            return null
        }
    }.castOrNull()