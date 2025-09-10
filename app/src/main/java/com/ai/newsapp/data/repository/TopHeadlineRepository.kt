package com.ai.newsapp.data.repository

import com.ai.newsapp.data.model.TopHeadlineResponse
import kotlinx.coroutines.flow.Flow

interface TopHeadlineRepository {

    fun getTopHeadLines(country:String): Flow<TopHeadlineResponse>

    fun getUserList(param: HashMap<String,String>) :Flow<String>
}