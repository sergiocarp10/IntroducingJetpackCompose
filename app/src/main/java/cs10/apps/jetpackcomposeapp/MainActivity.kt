package cs10.apps.jetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
fun TravelItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Blue)
    ){
        Icon(
            painter = painterResource(id = R.drawable.ic_bus),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .size(70.dp)
                .padding(horizontal = 8.dp)
        )

        Column {
            Text(
                text = "Jue 21/4 - 15:20 / 16:50",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.White
            )

            Text(
                text = "Av. 1 y 53 - Cruce Varela",
                fontSize = 18.sp,
                color = Color.White
            )

            Text(
                text = "Centenario ($32,09)",
                fontSize = 18.sp,
                color = Color.White
            )
        }
    }




}

// @Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeAppTheme {
        Greeting("Android")
    }
}