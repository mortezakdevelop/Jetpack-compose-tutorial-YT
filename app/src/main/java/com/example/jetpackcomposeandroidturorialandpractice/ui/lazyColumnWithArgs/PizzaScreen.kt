package com.example.jetpackcomposeandroidturorialandpractice.ui.lazyColumnWithArgs

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jetpackcomposeandroidturorialandpractice.R

@Composable
fun PizzaScreen(modifier: Modifier = Modifier, navController: NavHostController) {

    val pizzaPictures = arrayOf(
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

    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        val itemCount = pizzaNames.size
        items(itemCount) {
            ColumnItem(
                modifier = modifier,
                painter = pizzaPictures,
                names = pizzaNames,
                itemIndex = it,
                description = pizzaDescription,
                navController = navController
            )
        }
    }

}

@Composable
fun ColumnItem(
    modifier: Modifier,
    painter: Array<Int>,
    names: Array<String>,
    itemIndex: Int,
    description: Array<String>,
    navController: NavHostController,
) {
    Card(
        modifier = modifier
            .padding(8.dp)
            .wrapContentSize()
            .clickable { navController.navigate("PizzaDetailScreen/$itemIndex") },
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)

    ) {
        Row(
            modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Image(
                painter = painterResource(painter[itemIndex]),
                contentDescription = names[itemIndex],
                modifier
                    .size(130.dp)
                    .padding(start = 8.dp)
            )

            Column(
                modifier.padding(12.dp)
            ) {
                Text(text = names[itemIndex], fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Text(
                    text = description[itemIndex],
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }

}