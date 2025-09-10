package com.ai.newsapp

import android.app.Application
import com.ai.newsapp.di.component.ApplicationComponent
import com.ai.newsapp.di.component.DaggerApplicationComponent
import com.ai.newsapp.di.module.ApplicationModule

class NewsAppApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    fun injectDependencies(){

        applicationComponent= DaggerApplicationComponent
            .builder()
            .applicationModule(
            ApplicationModule(this))
            .build()

        applicationComponent.inject(this)


    }
}

