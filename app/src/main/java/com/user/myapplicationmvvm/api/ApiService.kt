package com.user.myapplicationmvvm.api

import com.user.myapplicationmvvm.Constants.ANIMAL_TYPE
import com.user.myapplicationmvvm.Constants.API_POINT
import com.user.myapplicationmvvm.model.CatsModel
import com.user.myapplicationmvvm.model.User
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface ApiService {
    @GET("placeholder/user/{userId}")
    suspend fun getUser(
        @Path("userId") userId: String
    ): User

    @GET(API_POINT)
    suspend fun getAnimalsData(
        @Query(ANIMAL_TYPE) name: String
    ): CatsModel
}