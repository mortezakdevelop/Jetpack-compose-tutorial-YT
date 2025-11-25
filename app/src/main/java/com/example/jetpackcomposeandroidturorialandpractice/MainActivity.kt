package com.example.jetpackcomposeandroidturorialandpractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpackcomposeandroidturorialandpractice.ui.TopAppBar
import com.example.jetpackcomposeandroidturorialandpractice.ui.lazyColumnSwipDelete.ListWithSwipDelete
import com.example.jetpackcomposeandroidturorialandpractice.ui.lazyColumnWithArgs.PizzaDetailScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.lazyColumnWithArgs.PizzaScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.navigateWithArgs.NavigationGraph
import com.example.jetpackcomposeandroidturorialandpractice.ui.navigation.NavigationGraph
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedNavigation.navigation.NavGraph
import com.example.jetpackcomposeandroidturorialandpractice.ui.theme.JetPackComposeAndroidTurorialAndPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeAndroidTurorialAndPracticeTheme {
                /* Column(modifier = Modifier.fillMaxSize()) {
                     //BottomNavigation()
                     val navController = rememberNavController()
                     //NavigationGraph(navController)
                     //NavigationGraph()
                     //NavGraph()
                    // TopAppBar()
                 }*/
             /*   val pizzaPictures = arrayOf(
                    R.drawable.pizza_one,
                    R.drawable.pizza_two,
                    R.drawable.pizza_one,
                    R.drawable.pizza_two,
                    R.drawable.pizza_one,
                    R.drawable.pizza_two,
                    R.drawable.pizza_one,
                    R.drawable.pizza_two,

                    )

                val pizzaNames = arrayOf(
                    "Vegan",
                    "American",
                    "Italian",
                    "Vegan",
                    "American",
                    "Italian",
                    "American",
                    "Italian",

                    )

                val pizzaDescription = arrayOf(
                    "this is content for this pizza",
                    "this is content for this pizza",
                    "this is content for this pizza",
                    "this is content for this pizza",
                    "this is content for this pizza",
                    "this is content for this pizza",
                    "this is content for this pizza",
                    "this is content for this pizza",
                )

                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "PizzaScreen") {
                    composable(route = "PizzaScreen") {
                        PizzaScreen(navController = navController)
                    }
                    composable(route = "PizzaDetailScreen/{itemIndex}",
                        arguments = listOf(
                            navArgument(
                                name = "itemIndex"
                            ){
                                type = NavType.IntType
                            }
                        )) { backstackEntry ->
                        PizzaDetailScreen(
                            image = pizzaPictures,
                            names = pizzaNames,
                            description = pizzaDescription,
                            itemIndex = backstackEntry.arguments?.getInt("itemIndex")
                        )
                    }
                }*/
                ListWithSwipDelete()
            }
        }
    }
}


@Composable
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun MyApp() {

}


@Preview(showSystemUi = true, showBackground = true, name = "test")
@Composable
fun ShowTextPreview() {
}