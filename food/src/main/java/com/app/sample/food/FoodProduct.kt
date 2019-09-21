package com.app.sample.food

import com.app.sample.utilities.Launcher
import com.app.sample.utilities.Product

class FoodProduct : Product {

    override fun onCreate(launcher: Launcher) {
        launcher.registerTab(FoodLaunchable())
    }
}