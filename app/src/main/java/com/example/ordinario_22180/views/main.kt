package com.example.ordinario_22180.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun main(navController: NavHostController) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
    ) {
        Text(
            text = "Partes Evaluadas en el Examen",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            colors = ButtonDefaults.buttonColors(Color(0xFF2196F3)),
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate("ParteLazyCartas") }) { Text(text = "Lazy Column con Cartas") }

        Button(
            colors = ButtonDefaults.buttonColors(Color(0xFF2196F3)),
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate("ParteAdivinaEdad") }) { Text(text = "Adivina la Edad") }

        Button(
            colors = ButtonDefaults.buttonColors(Color(0xFF2196F3)),
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate("ParteAPI") }) { Text(text = "Sección de API en Construcción") }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    main(navController = rememberNavController())
}