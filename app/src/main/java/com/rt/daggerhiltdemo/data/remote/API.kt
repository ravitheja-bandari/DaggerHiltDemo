package com.rt.daggerhiltdemo.data.remote

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryName

interface API {

    @GET("/facts/random")
    suspend fun getCatFacts(@Query("animal_type") animalType: String)

}