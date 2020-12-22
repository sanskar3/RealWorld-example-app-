package com.sanskar.api.services

import com.sanskar.api.models.Responses.ArticlesResponse
import com.sanskar.api.models.Responses.UserResponse
import com.sanskar.api.models.entities.UserCreds
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ConduitApi {

    @POST("users")
    suspend fun signUpUser(
        @Body userCreds: UserCreds
    ):Response<UserResponse>
    @GET("articles")
   suspend fun getArticles(
        @Query("author") author:String?=null,
        @Query("favourited") favourited:String?=null,
        @Query("tag") tags:List<String>?=null
    ): Response<ArticlesResponse>
}