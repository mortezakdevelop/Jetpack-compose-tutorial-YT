package com.example.jetpackcomposeandroidturorialandpractice.ui.navigateWithArgs

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun NavigationGraph(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "HomeScreen"){
        composable(route = "HomeScreen") {
            HomeScreen(navController)
        }
        composable(
            route = "DetailScreen/{name}/{age}",
            //optional argument  route = "DetailScreen?name={name}&age={age}
            arguments = listOf(
                navArgument(name = "name") {
                    type = NavType.StringType
                    //optional argument  defaultValue = "user"  or   nullable = true
                },
                navArgument(name = "age"){
                    type = NavType.IntType
                    //optional argument  defaultValue = 0  or   nullable = true
                }
            )
        ) { backstackEntry ->
            DetailScreen(
                name = backstackEntry.arguments?.getString("name"),
                age = backstackEntry.arguments?.getInt("age")
            )
        }
    }
}