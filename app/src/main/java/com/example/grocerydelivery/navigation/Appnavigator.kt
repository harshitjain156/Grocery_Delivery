package com.example.grocerydelivery.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.grocerydelivery.screens.Delivery
import com.example.grocerydelivery.screens.Details
import com.example.grocerydelivery.screens.login

@Composable
fun AppNavigator(navHostController:NavHostController) {

    NavHost(navController =navHostController , startDestination ="onboarding") {
        composable("onboarding"){
            Delivery{navHostController.navigate("Login")}
        }
        composable("Login"){
            login{
                navHostController.navigate("Details")
            }
        }
        composable("Details"){
            Details()
        }
    }
    
}