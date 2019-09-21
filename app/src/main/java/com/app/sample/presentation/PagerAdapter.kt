package com.app.sample.presentation

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.app.sample.utilities.TabLaunchable

class PagerAdapter(fm: FragmentManager, val items: List<TabLaunchable> = listOf()) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return items[position].fragment()
    }

    override fun getCount(): Int = items.size
}