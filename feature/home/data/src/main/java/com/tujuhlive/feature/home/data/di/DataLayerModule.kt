package com.tujuhlive.feature.home.data.di

import com.tujuhlive.core.network.provider.TrendingProvider
import com.tujuhlive.feature.home.data.repository.TrendingRepositoryImpl
import com.tujuhlive.feature.home.domain.repository.TrendingRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DataLayerModule {
    @Provides
    fun provideTrendingRepository(trendingProvider: TrendingProvider):TrendingRepository{
        return TrendingRepositoryImpl(trendingProvider)
    }
}