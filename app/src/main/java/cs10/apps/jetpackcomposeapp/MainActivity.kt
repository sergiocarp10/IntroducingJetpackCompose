package cs10.apps.jetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cs10.apps.jetpackcomposeapp.model.Travel
import cs10.apps.jetpackcomposeapp.ui.theme.JetpackComposeAppTheme
import cs10.apps.jetpackcomposeapp.viewmodel.TravelVM
import cs10.apps.jetpackcomposeapp.viewmodel.getSampleData

class MainActivity : ComponentActivity() {
    private val travelVM : TravelVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetpackComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TravelList(travelVM.travels)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun TravelList(travels: List<Travel>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(travels) {
            TravelItem(it)
            Divider(thickness = 8.dp)
        }
    }
}

@Composable
fun TravelItem(travel: Travel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Blue)
            .padding(vertical = 4.dp)
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
                text = String.format("%s %d/%d - %d:%d / %d:%d", travel.getWeekDayStr(), travel.day, travel.month, travel.startHour, travel.startMinute, travel.endHour, travel.endMinute),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.White
            )

            Text(
                text = "${travel.origin} - ${travel.destination}",
                fontSize = 18.sp,
                color = Color.White,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = String.format("%s ($%.2f)", travel.serviceName?: "Ramal sin nombre", travel.price),
                fontSize = 18.sp,
                color = Color.White
            )
        }
    }




}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeAppTheme {
        TravelList(travels = getSampleData())
    }
}