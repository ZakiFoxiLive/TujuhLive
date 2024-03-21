package com.tujuhlive.app.di

import com.tujuhlive.app.navigation.NavigationProvider
import com.tujuhlive.feature.home.ui.navigation.TrendingApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    fun provideNavigationProvider(trendingApi: TrendingApi):NavigationProvider{
        return NavigationProvider(trendingApi)
    }
}