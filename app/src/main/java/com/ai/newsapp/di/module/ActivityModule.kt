package com.ai.newsapp.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.ai.newsapp.di.ActivityContext
import com.ai.newsapp.di.component.ApplicationComponent
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: AppCompatActivity) {


    @ActivityContext
    @Provides
    fun provideContext(): Context{
        return activity
    }

}