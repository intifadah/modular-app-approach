package com.app.sample

import android.app.Application
import com.app.sample.utilities.Launcher

class App : Application(), Launcher.Provider {

    override lateinit var launcher: Launcher

    override fun onCreate() {
        super.onCreate()

        launcher = AppLauncher(this)
    }

}