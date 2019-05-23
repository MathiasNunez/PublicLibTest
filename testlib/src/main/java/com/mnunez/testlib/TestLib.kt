package com.mnunez.testlib

import android.content.Context
import android.widget.Toast

class TestLib {

    companion object {

        fun showMessage(context: Context) {
            Toast.makeText(context, "Hello from library", Toast.LENGTH_LONG).show()
        }
    }

}