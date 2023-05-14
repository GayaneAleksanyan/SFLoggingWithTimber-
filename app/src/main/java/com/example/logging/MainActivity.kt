package com.example.logging

import android.os.Bundle
import androidx.activity.ComponentActivity
import kotlinx.android.synthetic.main.activity_main.button_submit
import kotlinx.android.synthetic.main.activity_main.e_text
import kotlinx.android.synthetic.main.activity_main.text_from_edit_text
import timber.log.Timber

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_submit.setOnClickListener {
            text_from_edit_text.text = e_text.text
        }

        Timber.d("onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("text", text_from_edit_text.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        text_from_edit_text.text = savedInstanceState.getString("text")

    }

    override fun onStart() {
        super.onStart()
        Timber.d("onStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("onResume")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("onPause")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("onDestroy")
    }
}
