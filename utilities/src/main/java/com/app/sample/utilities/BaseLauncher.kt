package com.app.sample.utilities

import android.app.Application

abstract class BaseLauncher( override val application: Application) : Launcher {

    override val products: MutableList<Product> = mutableListOf()
    override val tabs: MutableList<TabLaunchable> = mutableListOf()

    override fun registerProduct(product: Product?) {
        if (product != null) {
            products.add(product)
        }
    }

    override fun registerTab(tab: TabLaunchable?) {
        if (tab != null) {
            tabs.add(tab)
        }
    }

    override fun onCreate() {
        products.forEach { it.onCreate(this) }
    }
}