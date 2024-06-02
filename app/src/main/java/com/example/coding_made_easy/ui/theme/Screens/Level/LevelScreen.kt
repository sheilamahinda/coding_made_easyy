package com.example.coding_made_easy.ui.theme.Screens.Level

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.Button
//import androidx.compose.material.ButtonDefaults
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.coding_made_easy.ui.theme.Screens.Register.RegisterScreen

@Composable
fun LevelScreen(navController: NavHostController) {

        Column(
            modifier = Modifier
                .fillMaxSize()
            .background(Color(0xFFFFA726)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Spacer(modifier = Modifier.height(80.dp))

            Box(
                modifier = Modifier
                    .size(180.dp)
                    .background(Color.White, RoundedCornerShape(16.dp))
                    
                    .background(Color(0xFFEEEEEE)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "START PLAYING QUIZ WITH FRIENDS",
                    color = Color(0xFFFFA726),
                    fontSize = 18.sp,
                    modifier = Modifier.padding(16.dp)
                )
            }

            Spacer(modifier = Modifier.height(120.dp))

            Text(
                text = "CATEGORY",
                color = Color.White,
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(40.dp))

            CategoryButton(text = "BEGINNER", navController = navController)
            Spacer(modifier = Modifier.height(60.dp))
            CategoryButton(text = "INTERMEDIATE", navController = navController)
            Spacer(modifier = Modifier.height(60.dp))
            CategoryButton(text = "ADVANCED", navController = navController)
        }
    }

    @Composable
    fun CategoryButton(text: String, navController: NavHostController) {
        Button(
            onClick = { navController.navigate("QuestionScreen")/* TODO: Handle click */ },
            colors = ButtonDefaults.buttonColors(Color(0xFFFFA726)),
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .height(50.dp)
                .width(200.dp)
        ) {
            Text(text = text, color = Color.White, fontSize = 16.sp)
        }
    }

@Preview
@Composable
fun LevelScreenpreview() {
    LevelScreen(rememberNavController())


}


