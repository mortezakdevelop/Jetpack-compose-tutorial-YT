package com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.DetailScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.ForgetPasswordScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.HomeScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.LoginScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.ProfileScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.RegisterScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.AuthRoute.route) {
        authGraph(navController)
        appNestedGraph(navController)
    }
}