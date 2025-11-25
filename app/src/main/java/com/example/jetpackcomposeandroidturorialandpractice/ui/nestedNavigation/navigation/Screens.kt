package com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.navigation

sealed class Screens(val route:String){
    object ScreenLoginRoute: Screens(route = "LoginScreen")
    object ScreenRegisterRoute: Screens(route = "RegisterScreen")
    object ScreenForgetPasswordRoute: Screens(route = "ForgetPasswordScreen")
    object ScreenHomeRoute: Screens(route = "HomeScreen")
    object ScreenDetailRoute: Screens(route = "DetailScreen")
    object ScreenProfileRoute: Screens(route = "ProfileScreen")
    object AuthRoute: Screens(route = "Auth")
    object AppRoute: Screens(route = "App")
}