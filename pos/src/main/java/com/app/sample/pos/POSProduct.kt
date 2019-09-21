package com.app.sample.pos

import com.app.sample.utilities.Launcher
import com.app.sample.utilities.Product

class POSProduct : Product {

    override fun onCreate(launcher: Launcher) {
        launcher.registerTab(POSLaunchable())
    }
}