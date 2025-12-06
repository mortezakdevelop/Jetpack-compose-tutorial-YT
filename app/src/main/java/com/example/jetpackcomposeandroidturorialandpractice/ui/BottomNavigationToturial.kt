package com.example.jetpackcomposeandroidturorialandpractice.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeandroidturorialandpractice.R


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun BottomNavigation() {
    //val items = listOf(
        /*        NavItemsState(
                    title = "home",
                    selectedIcon = Icons.Filled.Home,
                    unselectedIcon = Icons.Outlined.Home,
                    hasBadge = false,
                    badgeNumber = 0
                ),
                NavItemsState(
                    title = "Inbox",
                    selectedIcon = Icons.Filled.Email,
                    unselectedIcon = Icons.Outlined.Email,
                    hasBadge = true,
                    badgeNumber = 11
                ),
                NavItemsState(
                    title = "profile",
                    selectedIcon = Icons.Filled.Person,
                    unselectedIcon = Icons.Outlined.Person,
                    hasBadge = true,
                    badgeNumber = 2
                )*/
    //)
/*    var bottomNavState by rememberSaveable {
        mutableIntStateOf(0)
    }
    Scaffold(
        contentWindowInsets = WindowInsets.safeDrawing,
        bottomBar = {
            NavigationBar(
                modifier = Modifier
                    .padding(10.dp)
                    .navigationBarsPadding()
                    .clip(RoundedCornerShape(20.dp)),
                containerColor = colorResource(R.color.purple_200)
            ) {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = bottomNavState == index,
                        onClick = { bottomNavState = index },
                        icon = {
                            BadgedBox(badge = {
                                if (item.hasBadge) Badge {}
                                if (item.badgeNumber != 0) Badge {
                                    Text(text = "${item.badgeNumber}")
                                }
                            }) {
                                Icon(
                                    imageVector = if (bottomNavState == index) item.selectedIcon else item.unselectedIcon,
                                    contentDescription = item.title
                                )
                            }
                        },
                        label = { Text(text = item.title) },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = colorResource(R.color.teal_200),
                            selectedTextColor = colorResource(R.color.purple_700),
                            indicatorColor = colorResource(R.color.white)
                        )
                    )
                }
            }
        }
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = items[bottomNavState].title,
                fontSize = 16.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }*/
}

/*
data class NavItemsState(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasBadge: Boolean,
    val badgeNumber: Int
)*/
