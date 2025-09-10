package com.ai.newsapp.di.component

import com.ai.newsapp.MainActivity
import com.ai.newsapp.di.module.ActivityModule
import dagger.Component

@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

}