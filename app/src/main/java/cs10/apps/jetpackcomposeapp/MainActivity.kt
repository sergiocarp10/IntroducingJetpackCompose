package cs10.apps.jetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cs10.apps.jetpackcomposeapp.ui.theme.JetpackComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun TitleText(){
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Jue 21/4 - 15:20 / 16:50",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )

        Text(
            text = "Av. 1 y 53 - Cruce Varela",
            fontSize = 18.sp
        )

        Text(
            text = "Centenario ($32,09)",
            fontSize = 18.sp
        )
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeAppTheme {
        Greeting("Android")
    }
}