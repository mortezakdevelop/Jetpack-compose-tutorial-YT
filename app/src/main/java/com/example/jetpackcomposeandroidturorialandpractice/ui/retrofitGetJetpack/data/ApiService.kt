package com.example.jetpackcomposeandroidturorialandpractice.ui.retrofitGetJetpack.data

import com.example.jetpackcomposeandroidturorialandpractice.ui.retrofitGetJetpack.models.UserModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts/1")
    suspend fun getUserByNumber(): Response<UserModel>

}