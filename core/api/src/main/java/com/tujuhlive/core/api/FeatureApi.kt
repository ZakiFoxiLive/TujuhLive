package com.tujuhlive.core.api

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation

interface FeatureApi {
    fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ){
        navGraphBuilder.navigation(startDestination = "", route = "trending_navigation"){
            composable("trending"){
            }
        }
    }
}