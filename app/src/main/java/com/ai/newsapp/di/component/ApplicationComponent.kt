package com.ai.newsapp.di.component

import android.content.Context
import com.ai.newsapp.NewsAppApplication
import com.ai.newsapp.data.datasource.TopHeadlineDataSource
import com.ai.newsapp.data.repository.TopHeadlineRepository
import com.ai.newsapp.data.service.NetworkService
import com.ai.newsapp.di.ApplicationContext
import com.ai.newsapp.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class]) // Ensure this line exists
interface ApplicationComponent {

    fun inject(application: NewsAppApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineDataSource


}