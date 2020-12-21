package com.sanskar.api.services

import com.sanskar.api.models.ArticlesResponse
import retrofit2.http.GET

interface ConduitApi {

    @GET("articles")
    fun getArticles(): ArticlesResponse
}