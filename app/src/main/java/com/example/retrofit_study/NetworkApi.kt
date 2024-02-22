package com.example.retrofit_study

import retrofit2.Call
import retrofit2.http.GET

interface NetworkApi {

    @GET
    fun getData() : Call<String>
}