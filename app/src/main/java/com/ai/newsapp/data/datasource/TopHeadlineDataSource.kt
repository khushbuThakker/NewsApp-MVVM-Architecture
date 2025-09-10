package com.ai.newsapp.data.datasource

import com.ai.newsapp.data.model.TopHeadlineResponse
import com.ai.newsapp.data.repository.TopHeadlineRepository
import com.ai.newsapp.data.service.NetworkService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TopHeadlineDataSource @Inject constructor(private val networkService: NetworkService):
    TopHeadlineRepository {


    override fun getTopHeadLines(country: String): Flow<TopHeadlineResponse> {

        return flow {
            emit(networkService.getTopHeadLines(country))
        }
    }

    override fun getUserList(param: HashMap<String, String>): Flow<String> {
        return flow {
            emit(networkService.getUserList(param))
        }
    }
}