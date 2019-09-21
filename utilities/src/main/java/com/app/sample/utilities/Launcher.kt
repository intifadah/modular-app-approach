package com.app.sample.utilities

import android.app.Application

interface Launcher :
    ProductRegistry,
    TabRegistry {
    val application: Application

    interface Provider {
        val launcher: Launcher
    }
}


interface ProductRegistry {
    val products: List<Product>
    fun registerProduct(product: Product?)

    fun onCreate()
}

interface TabRegistry {
    val tabs: List<TabLaunchable>
    fun registerTab(tab: TabLaunchable?)
}
