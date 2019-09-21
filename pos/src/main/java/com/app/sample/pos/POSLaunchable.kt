package com.app.sample.pos

import android.support.v4.app.Fragment
import com.app.sample.utilities.TabLaunchable

class POSLaunchable : TabLaunchable {

    override fun fragment(): Fragment = POSFragment()
}