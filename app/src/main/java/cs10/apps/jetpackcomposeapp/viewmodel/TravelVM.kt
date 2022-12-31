package cs10.apps.jetpackcomposeapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cs10.apps.jetpackcomposeapp.model.Travel
import kotlinx.coroutines.launch

class TravelVM : ViewModel() {

    var travels by mutableStateOf(listOf<Travel>())
        private set

    init {
        viewModelScope.launch {
            travels = getSampleData()
        }
    }
}

fun getSampleData() : List<Travel> = listOf(
    Travel(4, 21, 12, 15, 30, 16, 45, "Av. 1 y 53", "Cruce Varela", "Centenario", 32.09),
    Travel(5, 22, 12, 11, 10, 12, 30, "Av. 1 y 48", "Senzabello y RP 36"),
    Travel(6, 23, 12, 15, 10, 15, 30, "Scalabrini Ortiz y Las Heras", "Scalabrini Ortiz y El Salvador", price = 28.0)
)