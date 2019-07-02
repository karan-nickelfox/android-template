package com.android.{{ cookiecutter.app_name.lower() }}

import android.app.Application
import net.hockeyapp.android.CrashManager;
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule

class {{ cookiecutter.app_name ~ "Application" }} : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@{{ cookiecutter.app_name ~ "Application" }}))
    }

    public void onCreate() {
        super.onCreate()

        CrashManager.register(this@{{ cookiecutter.app_name ~ "Application" }})
    }
}