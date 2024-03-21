package com.tujuhlive.core.network

import com.tujuhlive.core.network.model.BaseData
import com.tujuhlive.core.network.model.BaseResponse
import com.tujuhlive.core.network.model.Info
import com.tujuhlive.core.network.model.Trending
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("appapi/?service=Discover.Trending")
    suspend fun getTrending(
        @Query("language") language:String,
        @Query("uid") uid: String,
        @Query("p") p: Int,
        @Query("refreshOrder") refreshOrder: Int
    ):BaseResponse<BaseData<Info<Trending>>>
}