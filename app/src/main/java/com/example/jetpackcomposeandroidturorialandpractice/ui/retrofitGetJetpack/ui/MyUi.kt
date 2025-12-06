package com.example.jetpackcomposeandroidturorialandpractice.ui.retrofitGetJetpack.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeandroidturorialandpractice.ui.retrofitGetJetpack.models.UserModel

@Composable
fun MyUi(modifier: Modifier = Modifier, id: Int, userId: Int, title: String, body: String) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = id.toString(), fontSize = 20.sp)
        Text(text = title, fontSize = 20.sp)
        Text(text = body, fontSize = 20.sp)
        Text(text = userId.toString(), fontSize = 20.sp)
    }
}