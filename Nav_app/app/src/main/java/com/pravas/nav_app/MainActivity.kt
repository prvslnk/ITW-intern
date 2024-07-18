package com.pravas.nav_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.priyanka.navigationapplication.ui.theme.NavigationApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationApplicationTheme {
                //Function to understand State Management
                //CounterScreen()
                //Function to understand Navigation Controller and implementing lazy vertical grid in screen 5
                AppNavigation()

            }
        }
    }
}

@Composable
fun CounterScreen(){
    var count: Int by remember {
        mutableStateOf( 0)
    }
    var text: String by remember {
        mutableStateOf( " ")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ){
        Text(text="The count value is $count")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { count++ }) {
            Text(text = "Increment")
        }
        Button(onClick = { count-- }) {
            Text(text = "Decrement")
        }
        TextField(
            value = text ,
            onValueChange = { text=it },
            label = { Text ("enter password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
}

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "Screen5") {
        //composable("Screen1") { Screen1(navController) }
        //composable("Screen2") { Screen2(navController) }
        //composable("Screen3") { Screen3(navController) }
        composable("Screen4/{data}",
            arguments = listOf(navArgument("data") { type = NavType.StringType })
        ){ backStackEntry ->
            //Screen4(navController, backStackEntry.arguments?.getString("data") ?: "Priyanka")
        }
        composable("Screen5") { Screen5(navController) }
    }
}


@Composable
fun Screen1(navController: NavHostController) {
    Column {
        Text(
            text = "This is Screen1... Welcome to Screen1!!!",
            fontSize = 30.sp,
            color = Color.Green
        )
        Button(onClick = { navController.navigate("Screen2") }) {
            Text(text = "Go to Screen2")
        }
    }
}

@Composable
fun Screen2(navController: NavHostController) {
    Column {
        Text(
            text = "This is Screen2... Welcome to Screen2!!!",
            fontSize = 30.sp,
            color = Color.Cyan
        )
        Button(onClick = { navController.navigate("Screen3") }) {
            Text(text = "Go to Screen3")
        }
    }
}

@Composable
fun Screen3(navController: NavHostController) {
    var text by remember { mutableStateOf("") }
    Column {
        Text(
            text = "This is Screen3... Welcome!!!",
            fontSize = 30.sp,
            color = Color.Red
        )
        OutlinedTextField(
            value = text,
            onValueChange = { text = it }
        )
        Button(onClick = {
            if (text.isNotBlank()) {
                navController.navigate("Screen4/${text.trim()}")
            }
        }) {
            Text(text = "Go to Screen4")
        }
    }
}

@Composable
fun Screen4(navController: NavHostController,data:String) {
    Column {
        Text(
            text = "This is screen4...Welcome!!! Data is $data",
            fontSize = 30.sp,
            color=Color.Red
        )
        Button(onClick = { navController.navigate("screen5") }) {
            Text(text = "go to screen5")
        }
    }
}

@Composable
fun Screen5(navController: NavHostController) {
    val itemsList: List<String> = List(70){"items = $it"}
    LazyVerticalGrid(columns = GridCells.Adaptive(128.dp)) {
        items(itemsList){
            Card {
                Text(text = it)
            }
        }
    }
}