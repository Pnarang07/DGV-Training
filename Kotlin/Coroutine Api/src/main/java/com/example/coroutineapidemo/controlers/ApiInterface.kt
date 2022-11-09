package com.example.coroutineapidemo.controlers

import com.example.coroutineapidemo.models.MainData
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("photos")
    suspend fun getData():Response<List<MainData>>
}