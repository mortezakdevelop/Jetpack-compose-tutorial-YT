package com.example.jetpackcomposeandroidturorialandpractice.ui.searchView

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LanguageScreen(languages: List<String>, modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize()) {
        val textState = remember {
            mutableStateOf(TextFieldValue(""))
        }
        SearchViewScreen(state = textState, placeHolder = "search here...", modifier = modifier)
        val searchText = textState.value.text
        LazyColumn(contentPadding = PaddingValues(12.dp)) {
            items(items = languages) {
                ColumnItemLanguages(it)
            }
        }
    }
}

@Composable
fun SearchViewScreen(state: MutableState<TextFieldValue>, placeHolder: String, modifier: Modifier) {
    TextField(
        value = state.value, onValueChange = { value ->
            state.value = value
        },
        modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 10.dp, bottom = 10.dp)
            .clip(RoundedCornerShape(30.dp))
            .border(2.dp, Color.DarkGray,RoundedCornerShape(20.dp)),
        placeHolder = {
            placeHolder
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color.White,
            focusedTextColor = Color.Green
        ),
        maxLines = 1,
        textStyle = androidx.compose.ui.text.TextStyle(
            color = Color.Black,
            fontSize = 24.sp
        )
    )

}

@Composable
fun ColumnItemLanguages(items: String) {
    Column {
        Text(text = items, fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
        HorizontalDivider(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 16.dp),
            DividerDefaults.Thickness,
            DividerDefaults.color
        )
    }
}
