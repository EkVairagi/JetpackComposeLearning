package com.xynderous.jetpackcomposelearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun PreviewItem() {

    /*BlogCategory(
        image = R.drawable.heart,
        title = "Programming",
        subtitle = "Learn Different Programming"
    )*/


/*
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategoryList().map {
            BlogCategory(image = it.imgId, title = it.title, subtitle = it.subtitle)
        }
    }
*/

    LazyColumn(content = {
        items(getCategoryList()){
            BlogCategory(image = it.imgId, title = it.title, subtitle = it.subtitle)
        }
    })

}

@Composable
fun BlogCategory(image: Int, title: String, subtitle: String) {

    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )

            ItemDescription(title, subtitle, Modifier.weight(.8f))

        }
    }

}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp,
            style = MaterialTheme.typography.titleSmall
        )
    }
}


data class Category(val imgId: Int, val title: String, val subtitle: String)


fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.heart,"Programming","Learn Different Programming"))
    list.add(Category(R.drawable.heart,"Technology","Learn Different Technology"))
    list.add(Category(R.drawable.heart,"Full Stack","Learn Different Full Stack"))
    list.add(Category(R.drawable.heart,"Machine Learning","Learn Different Machine Learning"))
    list.add(Category(R.drawable.heart,"Data Analytics","Learn Different Data Analytics"))

    list.add(Category(R.drawable.heart,"Programming","Learn Different Programming"))
    list.add(Category(R.drawable.heart,"Technology","Learn Different Technology"))
    list.add(Category(R.drawable.heart,"Full Stack","Learn Different Full Stack"))
    list.add(Category(R.drawable.heart,"Machine Learning","Learn Different Machine Learning"))
    list.add(Category(R.drawable.heart,"Data Analytics","Learn Different Data Analytics"))

    list.add(Category(R.drawable.heart,"Programming","Learn Different Programming"))
    list.add(Category(R.drawable.heart,"Technology","Learn Different Technology"))
    list.add(Category(R.drawable.heart,"Full Stack","Learn Different Full Stack"))
    list.add(Category(R.drawable.heart,"Machine Learning","Learn Different Machine Learning"))
    list.add(Category(R.drawable.heart,"Data Analytics","Learn Different Data Analytics"))

        list.add(Category(R.drawable.heart,"Programming","Learn Different Programming"))
        list.add(Category(R.drawable.heart,"Technology","Learn Different Technology"))
        list.add(Category(R.drawable.heart,"Full Stack","Learn Different Full Stack"))
        list.add(Category(R.drawable.heart,"Machine Learning","Learn Different Machine Learning"))
        list.add(Category(R.drawable.heart,"Data Analytics","Learn Different Data Analytics"))

    return list
}
