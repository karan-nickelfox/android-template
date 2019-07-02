package com.android.sampleapp

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule

class SampleApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@SampleApplication))
    }
}