package com.glumes.sampleutil

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_base_toolbar.*

abstract class BaseToolbarActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.BaseContainer)
        setContentView(R.layout.activity_base_toolbar)
        setUpToolbar(mToolbar)
        setSupportActionBar(mToolbar)
    }


    override fun setContentView(layoutResID: Int) {
        if (layoutResID == R.layout.activity_base_toolbar) {
            super.setContentView(layoutResID)
        } else {
            setContent(layoutResID)
        }
    }


    override fun setContentView(view: View) {
        mContainer.removeAllViews()
        mContainer.addView(view)
    }

    override fun setContentView(view: View?, params: ViewGroup.LayoutParams?) {
        mContainer.removeAllViews()
        mContainer.addView(view, params)
    }

    private fun setContent(layoutResID: Int) {
        LayoutInflater.from(this).inflate(layoutResID, mContainer)
    }


    abstract fun setUpToolbar(toolbar: Toolbar)




}
