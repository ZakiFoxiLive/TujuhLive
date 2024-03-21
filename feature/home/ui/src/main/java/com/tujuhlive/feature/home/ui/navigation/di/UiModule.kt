package com.tujuhlive.feature.home.ui.navigation.di

import com.tujuhlive.feature.home.ui.navigation.TrendingApi
import com.tujuhlive.feature.home.ui.navigation.TrendingApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UiModule {
    @Provides
    fun provideTrendingApi():TrendingApi{
        return TrendingApiImpl()
    }
}