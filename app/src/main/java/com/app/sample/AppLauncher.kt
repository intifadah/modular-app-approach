package com.app.sample

import android.app.Application
import com.app.sample.utilities.BaseLauncher
import com.app.sample.utilities.loadProductOrNull

class AppLauncher(application: Application) : BaseLauncher(application) {
    private val productNames = listOf(
        ProductClassName.FOOD,
        ProductClassName.POS
    )

    init {
        productNames
            .mapNotNull { it.loadProductOrNull() }
            .forEach { registerProduct(it) }

        onCreate()
    }
}

