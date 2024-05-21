package com.example.ordinario_22180.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ordinario_22180.component.card
import kotlin.collections.ArrayList
import com.example.ordinario_22180.R

@Composable
fun parteLazyCartas(navController: NavHostController) {
    val items = listOf(
        card(number = "#1", titulo = "Adivina la edad", image = R.drawable.pastel),
        card(number = "#2", titulo = "Gato", image = R.drawable.gato),
        card(number = "#3", titulo = "NBA", image = R.drawable.nba),
        card(number = "#4", titulo = "Chuck Norris", image = R.drawable.norris)
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {

        Text(
            text = "Cartas Otorgadas por el Maestro",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.popBackStack() }
        ) {
            Text(text = "Regresar")
        }

        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn {
            items(items){
                Spacer(modifier = Modifier.height(10.dp))


            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview1() {
    parteLazyCartas(rememberNavController())
}