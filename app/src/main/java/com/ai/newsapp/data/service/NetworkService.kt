package com.ai.newsapp.data.service

import com.ai.newsapp.data.model.TopHeadlineResponse
import com.ai.newsapp.utils.AppConstant
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface NetworkService {

    @Headers("X-API-Key : ${AppConstant.API_KEY}", "User-Agent: ABC" , "Content-Type: Json")
    @GET("top-headlines")
    suspend fun getTopHeadLines(@Query("country") country:String): TopHeadlineResponse

    @Headers("X-API-Key : ${AppConstant.API_KEY}", "User-Agent: ABC" , "Content-Type: Json")
    @POST("get-user-list")
    suspend fun getUserList(@Body param: HashMap<String,String>):String

}