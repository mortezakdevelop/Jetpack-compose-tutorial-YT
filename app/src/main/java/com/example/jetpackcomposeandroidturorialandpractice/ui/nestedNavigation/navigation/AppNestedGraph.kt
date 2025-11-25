package com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.DetailScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.HomeScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.ProfileScreen

fun NavGraphBuilder.appNestedGraph(navController: NavHostController){
    navigation(startDestination = Screens.ScreenHomeRoute.route,route = Screens.AppRoute.route){
        composable(route = "HomeScreen") {
            HomeScreen(navController)
        }
        composable(route = "DetailScreen") {
            DetailScreen(navController)
        }
        composable(route = "ProfileScreen") {
            ProfileScreen(navController)
        }
    }
}