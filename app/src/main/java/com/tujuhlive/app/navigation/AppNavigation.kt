package com.tujuhlive.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tujuhlive.core.common.constants.NavigationConstants

@Composable
fun AppNavGraph(navController: NavHostController,
                navigationProvider: NavigationProvider){
    NavHost(navController = navController, startDestination = NavigationConstants.trendingRoute){
        navigationProvider.trendingApi.registerGraph(
            navController, this
        )
    }
}