package com.example.jetpackcomposeandroidturorialandpractice.ui.nestedLazyColumn

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainBookScreen(modifier: Modifier = Modifier, parentImageModel: ArrayList<ParentImageModel>) {
    LazyColumn(contentPadding = PaddingValues(15.dp)) {
        items(parentImageModel.size) {
            ColumnItemUi(
                modifier = modifier,
                parentItemList = parentImageModel,
                itemIndex = it
            )
        }
    }
}

@Composable
fun ColumnItemUi(modifier: Modifier, parentItemList: ArrayList<ParentImageModel>, itemIndex: Int) {
    Card(
        modifier.padding(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.DarkGray
        )
    ) {
        Text(
            text = parentItemList[itemIndex].title,
            modifier = modifier.padding(12.dp),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        LazyRow(contentPadding = PaddingValues(12.dp)) {
            items(parentItemList[itemIndex].images.size) {
                RowItemUi(
                    modifier = modifier,
                    childList = parentItemList[itemIndex].images,
                    rowItemIndex = it
                )
            }
        }
    }
}

@Composable
fun RowItemUi(modifier: Modifier, childList: List<ChildImageModel>, rowItemIndex: Int) {
    Box(
        modifier
            .height(200.dp)
            .width(150.dp)
            .padding(12.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xF1949292))
    ) {
        Image(
            painter = painterResource(childList[rowItemIndex].image),
            contentDescription = "Image",
            modifier.fillMaxSize()
        )
    }
}

