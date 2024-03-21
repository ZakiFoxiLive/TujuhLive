package com.tujuhlive.feature.home.domain.repository

import com.tujuhlive.feature.home.domain.model.Trending

interface TrendingRepository {
    suspend fun getTrendingList(language:String, uid: String, p: Int, refreshOrder: Int) : List<Trending>
}