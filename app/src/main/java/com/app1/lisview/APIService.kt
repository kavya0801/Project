package com.app1.lisview

import com.google.gson.JsonElement
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET("top-headlines")
    suspend fun getNews(
        @Query("country") country: String = "us",
        @Query("apiKey") apiKey: String = "dffb063c4fb04b9492497adce8b7aea6"
    ): JsonElement


}