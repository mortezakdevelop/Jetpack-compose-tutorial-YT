package com.example.jetpackcomposeandroidturorialandpractice.ui.lazyColumnWithArgs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PizzaDetailScreen(
    modifier: Modifier = Modifier,
    image: Array<Int>,
    names: Array<String>,
    description: Array<String>,
    itemIndex: Int?
) {
    Column(
        modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        itemIndex?.let {
            Box(modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(image[itemIndex]), "", modifier.clip(
                        RoundedCornerShape(8.dp)
                    )
                )

            }
            Text(text = names[itemIndex], fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text(
                text = description[itemIndex],
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}