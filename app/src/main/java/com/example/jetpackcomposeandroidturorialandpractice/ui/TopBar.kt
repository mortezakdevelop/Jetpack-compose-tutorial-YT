package com.example.jetpackcomposeandroidturorialandpractice.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.icons.Icons
import androidx.compose.material3.icons.filled.AccountCircle
import androidx.compose.material3.icons.filled.Add
import androidx.compose.material3.icons.filled.DateRange
import androidx.compose.material3.icons.filled.FavoriteBorder
import androidx.compose.material3.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeandroidturorialandpractice.R
import com.example.jetpackcomposeandroidturorialandpractice.ui.theme.JetPackComposeAndroidTurorialAndPracticeTheme


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun TopAppBar() {
    Scaffold(
        contentWindowInsets = WindowInsets.statusBars,
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .padding(10.dp)
                    .navigationBarsPadding()
                    .clip(RoundedCornerShape(20.dp))
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "account"
                        )
                    }

                    FloatingActionButton(
                        onClick = {},
                        shape = RoundedCornerShape(30.dp),
                        contentColor = Color.Green,
                        containerColor = Color.White,
                        elevation = FloatingActionButtonDefaults.elevation(0.dp)
                    ) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "account"
                        )
                    }

                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp),
                contentColor = Color.Green,
                containerColor = Color.Red,
                elevation = FloatingActionButtonDefaults.elevation(0.dp)
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
            }
        },
        topBar = {
            TopAppBar(
                title = {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(text = "this is top bar")
                    }
                },
                modifier = Modifier
                    .padding(10.dp)
                    .statusBarsPadding()
                    .clip(RoundedCornerShape(20.dp)),
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "Favorite"
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.DateRange, contentDescription = "Date")
                    }
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(R.color.light_green)
                ),
            )
        }
    ) { }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun TopAppBarPreview() {
    JetPackComposeAndroidTurorialAndPracticeTheme {
        TopAppBar()
    }
}