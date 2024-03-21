package com.tujuhlive.feature.home.data.repository

import com.tujuhlive.core.network.provider.TrendingProvider
import com.tujuhlive.feature.home.data.mapper.toDomainTrendingList
import com.tujuhlive.feature.home.domain.model.Trending
import com.tujuhlive.feature.home.domain.repository.TrendingRepository
import javax.inject.Inject

class TrendingRepositoryImpl @Inject constructor(private val trendingProviders: TrendingProvider): TrendingRepository {
    override suspend fun getTrendingList(
        language: String,
        uid: String,
        p: Int,
        refreshOrder: Int
    ): List<Trending> {
        return trendingProviders.getTrendingList(language, uid, p, refreshOrder).toDomainTrendingList()
    }
}