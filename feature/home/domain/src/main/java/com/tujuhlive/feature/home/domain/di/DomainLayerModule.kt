package com.tujuhlive.feature.home.domain.di

import com.tujuhlive.feature.home.domain.repository.TrendingRepository
import com.tujuhlive.feature.home.domain.usecase.TrendingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainLayerModule {
    @Provides
    fun provideTrendingListUseCase(trendingRepository: TrendingRepository):TrendingUseCase{
        return TrendingUseCase(trendingRepository)
    }
}