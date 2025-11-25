package com.example.jetpackcomposeandroidturorialandpractice.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NavigationGraph(navController: NavHostController){

    NavHost(navController = navController, startDestination = "ScreenA") {
        composable("ScreenA") {
            ScreenA(navController)
        }
        composable("ScreenB") {
            ScreenB(navController)
        }
        composable("ScreenC") {
            ScreenC(navController)
        }
    }
}