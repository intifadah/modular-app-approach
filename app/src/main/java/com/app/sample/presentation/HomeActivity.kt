package com.app.sample.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.app.sample.App
import com.app.sample.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var pagerAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initHomePager()
    }

    private fun initHomePager() {
        val tabs = (applicationContext as App).launcher.tabs
        pagerAdapter = PagerAdapter(supportFragmentManager, tabs)
        pager_product.apply {
            adapter = pagerAdapter
        }
        tab_product.setupWithViewPager(pager_product)
    }
}