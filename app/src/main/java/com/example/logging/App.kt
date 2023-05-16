package com.example.logging

import android.app.Application
import android.content.res.Configuration
import timber.log.Timber
import timber.log.Timber.DebugTree

class App : Application() {
    val objectInAppClass = "Object"
    override fun onCreate() {
        super.onCreate()
        instance = this

        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
    }

    companion object {
        lateinit var instance: App
            private set
    }
}