package com.example.jetpackcomposeandroidturorialandpractice

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedLazyColumn.ChildImageModel
import com.example.jetpackcomposeandroidturorialandpractice.ui.nestedLazyColumn.ParentImageModel
import com.example.jetpackcomposeandroidturorialandpractice.ui.retrofitGetJetpack.ui.MyUi
import com.example.jetpackcomposeandroidturorialandpractice.ui.retrofitGetJetpack.utils.RetrofitInstance
import com.example.jetpackcomposeandroidturorialandpractice.ui.theme.JetPackComposeAndroidTurorialAndPracticeTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okio.IOException
import retrofit2.HttpException

class MainActivity : ComponentActivity() {
    private val imagesItemList = ArrayList<ParentImageModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeAndroidTurorialAndPracticeTheme {
                val scope = rememberCoroutineScope()

                var body by remember {
                    mutableStateOf("")
                }

                var title by remember {
                    mutableStateOf("")
                }

                var id by remember {
                    mutableIntStateOf(0)
                }

                var userid by remember {
                    mutableIntStateOf(0)
                }


                LaunchedEffect(key1 = true) {
                    scope.launch(Dispatchers.IO) {
                        val response = try {
                            RetrofitInstance.api.getUserByNumber()
                        } catch (e: IOException) {
                            Toast.makeText(this@MainActivity, "${e.message}", Toast.LENGTH_SHORT)
                                .show()
                            return@launch

                        } catch (e: HttpException) {
                            Toast.makeText(this@MainActivity, "${e.message}", Toast.LENGTH_SHORT)
                                .show()
                            return@launch
                        }
                        if (response.isSuccessful && response.body() != null) {
                            withContext(Dispatchers.Main) {
                                body = response.body()!!.body
                                id = response.body()!!.id
                                userid = response.body()!!.userId
                                title = response.body()!!.title
                            }
                        }
                    }
                }

                MyUi(
                    id = id,
                    userId = userid,
                    title = title,
                    body = body
                )

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