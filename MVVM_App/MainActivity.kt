package com.pravas.mvvaapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                //Function to implement basic MVVM architecture
                CounterView()
            }
        }
    }

    @Composable
    fun CounterView(counterVM: CounterViewModel = viewModel()) {
        val counterState = counterVM.counter.value
        var intContent = GenericClass(129)
        var stringContent = GenericClass("hello generics")

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Current Counter Value: ${counterState.count}")
            Row {
                Button(onClick = { counterVM.incrementCounter() }) {
                    Text(text = "Increment")
                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(onClick = { counterVM.decrementCounter() }) {
                    Text(text = "decrement")
                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(onClick = { counterVM.login()
                    println("${intContent.content},${stringContent.content}")})
                {
                    Text(text = "login")
                }
            }
        }
    }
}

//Model Class
data class Counter(val count: Int)
data class User(val username: String, val password: String)

//ViewModelClass
class CounterViewModel : ViewModel() {
    private val _counter = mutableStateOf(Counter(0))
    val counter: State<Counter> = _counter

    fun incrementCounter() {
        _counter.value = Counter(_counter.value.count + 1)
    }
    fun decrementCounter() {
        _counter.value = Counter(_counter.value.count - 1)
    }
    fun resetCounter() {
        _counter.value = Counter(0)
    }
    fun login() {
        //login
    }

}

class GenericClass<T>(var content: T)
