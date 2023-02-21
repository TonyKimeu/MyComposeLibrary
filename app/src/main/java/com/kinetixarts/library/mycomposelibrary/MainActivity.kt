package com.kinetixarts.library.mycomposelibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kinetixarts.library.image_preview.ImagePreview
import com.kinetixarts.library.mycomposelibrary.ui.theme.MyComposeLibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeLibraryTheme {
                // A surface container using the 'background' color from the theme
                Box( modifier = Modifier.fillMaxSize()) {
                    ImagePreview(
                        image = painterResource(id = R.drawable.kermit),
                        description = "Hello World",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(150.dp)
                    )

                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeLibraryTheme {
        Greeting("Android")
    }
}