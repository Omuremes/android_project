package com.example.mycity.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.mycity.ui.CategoryScreen
import com.example.mycity.ui.DetailScreen
import com.example.mycity.ui.PlacesScreen

@Composable
fun MyCityNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = "categories",
        modifier = modifier
    ) {
        composable("categories") {
            CategoryScreen(
                onCategoryClick = { category ->
                    navController.navigate("places/${category.id}")
                }
            )
        }
        composable(
            route = "places/{categoryId}",
            arguments = listOf(navArgument("categoryId") { type = NavType.IntType })
        ) { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getInt("categoryId") ?: return@composable
            PlacesScreen(
                categoryId = categoryId,
                onPlaceClick = { place ->
                    navController.navigate("details/${place.id}")
                },
                onNavigateUp = { navController.navigateUp() }
            )
        }
        composable(
            route = "details/{placeId}",
            arguments = listOf(navArgument("placeId") { type = NavType.IntType })
        ) { backStackEntry ->
            val placeId = backStackEntry.arguments?.getInt("placeId") ?: return@composable
            DetailScreen(
                placeId = placeId,
                onNavigateUp = { navController.navigateUp() },
                onMapClick = { id -> navController.navigate("map/$id") }
            )
        }
        composable(
            route = "map/{placeId}",
            arguments = listOf(navArgument("placeId") { type = NavType.IntType })
        ) { backStackEntry ->
            val placeId = backStackEntry.arguments?.getInt("placeId") ?: return@composable
            com.example.mycity.ui.MapScreen(
                placeId = placeId,
                onNavigateUp = { navController.navigateUp() }
            )
        }
    }
}
