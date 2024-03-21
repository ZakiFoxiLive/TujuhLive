package com.tujuhlive.feature.home.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.tujuhlive.core.api.FeatureApi
import com.tujuhlive.core.common.constants.NavigationConstants

internal object InternalTrendingFeatureApi: FeatureApi {
    override fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ){
        navGraphBuilder.navigation(startDestination = NavigationConstants.trendingScreenRoute, route = NavigationConstants.trendingRoute){
            composable(NavigationConstants.trendingScreenRoute){

            }
        }
    }
}