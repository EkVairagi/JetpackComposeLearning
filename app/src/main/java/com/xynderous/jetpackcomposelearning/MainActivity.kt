package com.xynderous.jetpackcomposelearning

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
           // CircularImage()
            PreviewItem()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, heightDp = 500, widthDp = 300)
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


/*

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }
*/

/*
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }
*/
/*

    //Box is Similar to Framelayout
    Box(
        contentAlignment = Alignment.Center
    ) {
        Image(painter = painterResource(id = R.drawable.heart), contentDescription = "")
        Image(painter = painterResource(id = R.drawable.arrow), contentDescription = "")
    }
*/

/*
    Column {
        ListView(R.drawable.heart,"Sangam Nayak","Software Developer")
        ListView(R.drawable.heart,"Sangam Nayak","Software Developer")
        ListView(R.drawable.heart,"Sangam Nayak","Software Developer")
        ListView(R.drawable.heart,"Sangam Nayak","Software Developer")
    }
*/

    Text(
        text = "Hello",
        color = Color.White,
        modifier = Modifier
            .background(Color.Red)
            .size(50.dp)
            .border(4.dp, Color.Green)
            .clip(CircleShape)
            .background(Color.Yellow)
    )


}

@Composable
fun CircularImage(){
    Image(
        painter = painterResource(id = R.drawable.heart),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape),
        contentDescription = ""
    )
}

@Composable
fun ListView(imageId:Int, name:String, occupation:String){
    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = "",
            Modifier.size(40.dp)
        )
        Column {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp
            )
        }
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
