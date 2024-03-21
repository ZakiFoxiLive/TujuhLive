package com.tujuhlive.feature.home.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.tujuhlive.core.api.FeatureApi

interface TrendingApi: FeatureApi {
}

class TrendingApiImpl : TrendingApi{
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalTrendingFeatureApi.registerGraph(
            navController, navGraphBuilder
        )
        super.registerGraph(navController, navGraphBuilder)
    }
}