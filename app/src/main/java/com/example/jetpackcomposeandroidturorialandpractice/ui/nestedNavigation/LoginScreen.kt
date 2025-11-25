package com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.navigation.Screens

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "LoginScreen", fontSize = 32.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate(route = Screens.ScreenHomeRoute.route)
        }) {
            Text(text = "Login(Go to home)")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate(route = Screens.ScreenForgetPasswordRoute.route)
        }) {
            Text(text = "Forget password")
        }
        Button(onClick = {
            navController.navigate(route = "RegisterScreen")
        }) {
            Text(text = "Register")
        }
    }
}