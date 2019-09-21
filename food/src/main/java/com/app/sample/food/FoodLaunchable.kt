package com.app.sample.food

import android.support.v4.app.Fragment
import com.app.sample.utilities.TabLaunchable

class FoodLaunchable : TabLaunchable {

    override fun fragment(): Fragment = FoodFragment()
}