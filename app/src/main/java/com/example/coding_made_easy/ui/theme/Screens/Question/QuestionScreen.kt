package com.example.coding_made_easy.ui.theme.Screens.Question

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.Button
//import androidx.compose.material.ButtonDefaults
//import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.coding_made_easy.R
import com.example.coding_made_easy.ui.theme.Screens.Level.LevelScreen

@Composable
fun QuestionScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFA726)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.cuter), // Replace with your image resource
            contentDescription = "Leopard",
            modifier = Modifier.size(150.dp).padding(1.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(16.dp))
                .padding(16.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "WHICH OF THE FOLLOWING IS THE CORRECT SYNTAX OF PYTHON?",
                    color = Color(0xFFFFA726),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                ChoiceButton(text = "THIS IS CHOICE A")
                Spacer(modifier = Modifier.height(10.dp))
                ChoiceButton(text = "THIS IS CHOICE B")
                Spacer(modifier = Modifier.height(10.dp))
                ChoiceButton(text = "THIS IS CHOICE C")
                Spacer(modifier = Modifier.height(10.dp))
                ChoiceButton(text = "THIS IS CHOICE D")
            }
        }
    }
}

@Composable
fun ChoiceButton(text: String) {
    Button(
        onClick = { /* TODO: Handle click */ },
        colors = ButtonDefaults.buttonColors(Color(0xFFFFA726)),
        shape = RoundedCornerShape(50),
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
    ) {
        Text(text = text, color = Color.White, fontSize = 16.sp)
    }
}
@Preview
@Composable
fun QuestionScreenpreview() {
    QuestionScreen(rememberNavController())


}
