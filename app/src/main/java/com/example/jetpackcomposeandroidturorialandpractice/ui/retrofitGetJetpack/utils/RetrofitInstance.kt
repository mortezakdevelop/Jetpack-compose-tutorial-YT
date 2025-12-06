package com.example.jetpackcomposeandroidturorialandpractice.ui.retrofitGetJetpack.utils

import com.example.jetpackcomposeandroidturorialandpractice.ui.retrofitGetJetpack.data.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(Utils.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }
}