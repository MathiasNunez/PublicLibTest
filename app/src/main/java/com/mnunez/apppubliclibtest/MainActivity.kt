package com.mnunez.apppubliclibtest

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.mnunez.testlib.TestLib


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            TestLib.showMessage(this)
        }, 1500)

    }
}
