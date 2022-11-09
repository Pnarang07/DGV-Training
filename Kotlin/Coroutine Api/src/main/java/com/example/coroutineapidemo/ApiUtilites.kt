package com.example.coroutineapidemo

import com.example.coroutineapidemo.controlers.ApiInterface
import com.example.coroutineapidemo.models.MainData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiUtilites {

    val BASE_URL="https://jsonplaceholder.typicode.com/"


    fun getInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}