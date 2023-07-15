package com.redcoding.watermyplants.android

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.redcoding.watermyplants.android.garden.GardenScreen
import com.redcoding.watermyplants.android.plantdetails.PlantDetailsScreen

@Composable
internal fun MainScreen() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.Garden.name,
    ) {
        composable(route = ScreenRoutes.Garden.name) {
            GardenScreen {
                navController.navigate(ScreenRoutes.PlantDetails.name)
            }
        }
        composable(route = ScreenRoutes.PlantDetails.name) {
            PlantDetailsScreen()
        }
    }
}

enum class ScreenRoutes { Garden, PlantDetails }
