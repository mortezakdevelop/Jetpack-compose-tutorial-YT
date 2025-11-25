package com.example.jetpackcomposeandroidturorialandpractice.ui.navigateWithArgs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var nameValue by remember {
            mutableStateOf("")
        }
        var ageValue by remember {
            mutableStateOf("")
        }
        Text("Home screen")
        Spacer(modifier = Modifier.height(24.dp))
        TextField(
            value = nameValue,
            onValueChange = {nameValue = it},
            Modifier.padding(10.dp),
            placeholder = {
                Text("Enter your name")
            }
        )
        TextField(
            value = ageValue,
            onValueChange = {ageValue = it},
            Modifier.padding(10.dp),
            placeholder = {
                Text("Enter your age")
            }
        )

        Button(onClick = {
            navController.navigate(route = "DetailScreen/$nameValue/$ageValue")
            //optional argument navController.navigate(route = "DetailScreen?name=$nameValue&age=$ageValue)
        }) {
            Text(text = "pass data", fontSize = 30.sp)
        }

    }
}