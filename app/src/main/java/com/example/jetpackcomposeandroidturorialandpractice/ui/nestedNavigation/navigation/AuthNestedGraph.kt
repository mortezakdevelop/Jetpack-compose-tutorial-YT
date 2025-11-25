package com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.ForgetPasswordScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.LoginScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.RegisterScreen

fun NavGraphBuilder.authGraph(navController: NavHostController) {
    navigation(startDestination = Screens.ScreenLoginRoute.route, route = Screens.AuthRoute.route) {
        composable(route = "LoginScreen") {
            LoginScreen(navController)
        }
        composable(route = "RegisterScreen") {
            RegisterScreen(navController)
        }
        composable(route = "ForgetPasswordScreen") {
            ForgetPasswordScreen(navController)
        }
    }
}