package com.example.ordinario_22180.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ordinario_22180.R

@Composable
fun card(number: String, titulo: String, image: Int) {
    Card {
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)){

            Text(text = number,
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp)

            Spacer(modifier = Modifier.width(30.dp))

            Column {
                Text(text = titulo,
                    fontSize = 20.sp)

                Image(
                    painter = painterResource(id = image),
                    contentDescription = "person",
                    contentScale = ContentScale.Crop
                    )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview4() {
    card(number = "#1", titulo = "Chuck Norris", image = R.drawable.norris)
}