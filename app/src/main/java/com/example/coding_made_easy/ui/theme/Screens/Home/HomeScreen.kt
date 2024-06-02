package com.example.coding_made_easy.ui.theme.Screens.Home


//import androidx.compose.material.Button
//import androidx.compose.material.ButtonDefaults
//import androidx.compose.material.Text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.coding_made_easy.R
import kotlinx.coroutines.delay


//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            HomeScreen()
//        }
//    }
//}

@Composable
fun HomeScreen(navController: NavHostController) {
    val context = LocalContext.current
    val backgroundDrawable =
        painterResource(id = R.drawable.drippingyellow) // Replace with your background image resource
    var textVisible by remember { mutableStateOf(false) }

    // LaunchedEffect to start the animation after a delay
    LaunchedEffect(Unit) {
        delay(500) // Delay for 0.5 seconds before showing the text
        textVisible = true
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
//            .background(Color(0xFFFFE0B2))
    ) {
        Image(
            painter = backgroundDrawable, // Replace with your background image resource
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            AnimatedVisibility(
                visible = textVisible,
                enter = fadeIn()
            ){
            Text(
                text = "LET'S GET STARTED",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFCC8034),
                modifier = Modifier.padding(bottom = 70.dp)
            )}

            Image(
                painter = painterResource(id = R.drawable.cute), // Replace with your image resource
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(350.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {   navController.navigate("LoginScreen")/* Handle login */ },
                colors = ButtonDefaults.buttonColors( Color(0xFFCC8034)),
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.5f)
                    .height(48.dp)
            ) {
                Text(
                    text = "LOG IN",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}



@Preview
@Composable
fun Homepreview() {
    HomeScreen(rememberNavController())


}
