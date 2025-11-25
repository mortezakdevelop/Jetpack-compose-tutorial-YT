package com.example.jetpackcomposeandroidturorialandpractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedLazyColumn.ChildImageModel
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedLazyColumn.MainBookScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedLazyColumn.ParentImageModel
import com.example.jetpackcomposeandroidturorialandpractice.ui.searchView.LanguageScreen
import com.example.jetpackcomposeandroidturorialandpractice.ui.theme.JetPackComposeAndroidTurorialAndPracticeTheme

class MainActivity : ComponentActivity() {
    private val imagesItemList = ArrayList<ParentImageModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeAndroidTurorialAndPracticeTheme {
                //LanguageScreen(languages = list)
                //setData()
                //MainBookScreen(modifier = Modifier,imagesItemList)
            }
        }
    }

    val list = listOf(
        "java",
        "kotlin",
        "c++",
        "rust",
        "javascript",
        "c sharp",
        "assembly",
        "python",
        "c",
        "huskel",
        "lua",
        "xml",
        "dart",
        "go",
        "dart",
        "swift",
        "html",
        "css",
        "objective c"
    )

    private fun setData() {
        val images = listOf(
            ChildImageModel(R.drawable.book_one),
            ChildImageModel(R.drawable.book_three),
            ChildImageModel(R.drawable.book_four),
            ChildImageModel(R.drawable.book_five),
            ChildImageModel(R.drawable.book_one),
            ChildImageModel(R.drawable.book_three),
        )

        imagesItemList.add(ParentImageModel("Books:", images))
        imagesItemList.add(ParentImageModel("History:", images.reversed()))
        imagesItemList.add(ParentImageModel("Drama:", images.shuffled()))
        imagesItemList.add(ParentImageModel("Crim:", images.shuffled()))

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