package com.example.ordinario_22180.views

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.provider.FontsContractCompat.Columns
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun parteAdivinaEdad(navController: NavHostController) {
    var prompt by remember { mutableStateOf("") }

    Column {
        TextField(
            value = prompt,
            onValueChange = {prompt = it},
            label = {Text(text = "Ingresa tu año de nacimiento")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(15.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            onClick = {}
        ) {
            Text(text = "Botón")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview2() {
    parteAdivinaEdad(rememberNavController())
}