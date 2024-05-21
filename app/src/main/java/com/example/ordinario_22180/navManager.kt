package com.example.ordinario_22180

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ordinario_22180.views.main
import com.example.ordinario_22180.views.parteAPI
import com.example.ordinario_22180.views.parteAdivinaEdad
import com.example.ordinario_22180.views.parteLazyCartas

@Composable
fun NavManager() {

    //Definir desde un nivel superior el NavController y los ViewModels que utilizaran las Views
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "Main") {

        //Renderizar las pantallas definiendo el nombre de su ruta
        composable(route = "MainView") {
            main(navController)
        }

        composable(route = "ParteLazyCartas") {
            parteLazyCartas(navController)
        }

        composable(route = "ParteAdivinaEdad") {
            parteAdivinaEdad(navController)
        }

        composable(route = "ParteAPI") {
            parteAPI(navController)
        }

    }
}