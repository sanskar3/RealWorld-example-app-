package com.sanskar.api

import com.sanskar.api.services.ConduitApi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ConduitClient {

    val retrofit = Retrofit.Builder()
        .baseUrl("http://conduit.productionready.io/api/")
        .addConverterFactory(MoshiConverterFactory.create()).build()

    val api =retrofit.create(ConduitApi::class.java)
}