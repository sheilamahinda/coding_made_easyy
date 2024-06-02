package com.example.coding_made_easy.ui.theme.Screens.Register
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.coding_made_easy.data.Apiviewmodel
import com.example.coding_made_easy.ui.theme.Screens.Home.HomeScreen
//import kotlinx.coroutines.flow.internal.NoOpContinuation.context
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            RegisterScreen()
//        }
//    }
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color(0xFFFFA726)), // Orange color
                contentAlignment = Alignment.CenterStart
            ) {

                Text(
                    text = "LOG IN",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.padding(start = 16.dp, top = 16.dp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
                    .background(Color(0xFFEEEEEE)) // Light gray color
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    OutlinedTextField(
                        value = "email, onValueChange = { email = it }",
                        onValueChange = {},
                        label = { Text("EMAIL", color = Color(0xFFFFA726)) },
                        colors = androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color(0xFFFFA726),
                            unfocusedBorderColor = Color(0xFFFFA726)
                        ),
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .fillMaxWidth(0.8f)
                    )
                    OutlinedTextField(
                        value = "confirmpass, onValueChange = { confirmpass = it }",
                        onValueChange = {},
                        label = { Text("PASSWORD", color = Color(0xFFFFA726)) },
                        visualTransformation = PasswordVisualTransformation(),
                        colors = androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color(0xFFFFA726),
                            unfocusedBorderColor = Color(0xFFFFA726)
                        ),
                        modifier = Modifier
                            .padding(bottom = 32.dp)
                            .fillMaxWidth(0.8f)
                    )
                    Button(
                        onClick = { val mylogin = Apiviewmodel(navController, context)
                            mylogin.login(email.text.trim(), pass.text.trim())  /* Handle sign in */ },
                        colors = ButtonDefaults.buttonColors(Color(0xFFFFA726)),
                        shape = RoundedCornerShape(50),
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(0.5f)
                            .height(48.dp)
                    ) {
                        Text(
                            text = "SIGN IN",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Text(
                        text = "ALREADY HAVE AN ACCOUNT? SIGN IN",
                        color = Color(0xFFFFA726),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth() // Expands the clickable area to the full width of the screen
                            .clickable {
                                // Handle navigation action here, for example:
                                navController.navigate("LoginScreen")
                            }
                    )
                }
            }
        }
    }
}

//@Composable
//fun SemicircularBackground() {
//    Box(modifier = Modifier.fillMaxSize()) {
//        Canvas(modifier = Modifier.fillMaxSize()) {
//            val path = Path().apply {
//                moveTo(0f, size.height)
//                cubicTo(
//                    size.width * 0.25f, size.height,
//                    size.width * 0.75f, size.height,
//                    size.width, size.height
//                )
//                lineTo(size.width, 0f)
//                lineTo(0f, 0f)
//                close()
//            }
//            drawPath(path, color = Color(0xFFFFA726))
//        }
//    }
//}

@Preview
@Composable
fun RegisterScreenpreview() {
    RegisterScreen(rememberNavController())


}
