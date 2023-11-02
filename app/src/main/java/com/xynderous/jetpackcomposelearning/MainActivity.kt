package com.xynderous.jetpackcomposelearning

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xynderous.jetpackcomposelearning.ui.theme.JetpackComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //TextInput()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun previewFun() {
   /* Text(
        text = "hello cheezy",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        color = Color.Red,
        fontSize = 36.sp,
        textAlign = TextAlign.Center
    )*/
    
    /*Image(painter = painterResource(
        id = R.drawable.ic_launcher_background),
        contentDescription = "Dummy Image",
        colorFilter = ColorFilter.tint(Color.Yellow),
        contentScale = ContentScale.Crop
    )*/

    /*Button(onClick = {  }, colors = ButtonDefaults.buttonColors(
        contentColor = Color.White,
        containerColor = Color.Black
    ), enabled = false) {
        Text(text = "Hello")
        Image(painter = painterResource(
            id = R.drawable.ic_launcher_background),
            contentDescription = "Dummy Image"
        )
    }*/

    /*TextField(
        value = "Hello Sangam",
        onValueChange = {},
        label = { Text(text = "Enter message")},
        placeholder = {}
        )*/



    Column {
        Text(text = "A", fontSize = 24.sp)
        Text(text = "A", fontSize = 24.sp)
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput(){
    val state = remember {
        mutableStateOf("")
    }

    TextField(
        value = state.value,
        onValueChange = {
                        state.value = it
        },
        label = { Text(text = "Enter message")},
    )
}
