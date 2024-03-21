package com.tujuhlive.core.network.provider

import com.tujuhlive.core.network.ApiService
import javax.inject.Inject

class TrendingProvider @Inject constructor(private val apiService: ApiService){
    suspend fun getTrendingList(language:String, uid: String, p: Int, refreshOrder: Int) =
        apiService.getTrending(language, uid, p, refreshOrder)
}