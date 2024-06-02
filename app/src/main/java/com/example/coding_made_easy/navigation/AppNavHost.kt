package com.example.coding_made_easy.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.example.coding_made_easy.data.QuizViewModel
//import com.example.coding_made_easy.ui.theme.Screens.How_To_Play.HowToPlayScreen
//import com.example.coding_made_easy.ui.theme.Screens.Login.LoginScreen
import com.example.coding_made_easy.ui.theme.Screens.Home.HomeScreen
import com.example.coding_made_easy.ui.theme.Screens.Level.LevelScreen
import com.example.coding_made_easy.ui.theme.Screens.Login.LoginScreen
import com.example.coding_made_easy.ui.theme.Screens.Question.QuestionScreen
import com.example.coding_made_easy.ui.theme.Screens.Register.RegisterScreen

//import com.example.coding_made_easy.ui.theme.Screens.Questions.QuizApp
//import com.example.coding_made_easy.ui.theme.Screens.Register.RegisterScreen
//
//import com.example.coding_made_easy.ui.theme.Screens.Result.ResultsPage
import com.example.coding_made_easy.ui.theme.Screens.Splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier, navController: NavHostController= rememberNavController(),startDestination:String= ROUTE_SPLASH) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUTE_QUESTION) {
            QuestionScreen(navController)
        }
        composable(ROUTE_LEVEL) {
            LevelScreen(navController)
        }
    }
}