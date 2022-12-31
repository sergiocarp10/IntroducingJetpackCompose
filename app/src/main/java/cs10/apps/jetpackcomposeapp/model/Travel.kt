package cs10.apps.jetpackcomposeapp.model

data class Travel(
    val weekDay: Int,
    val day: Int,
    val month: Int,
    val startHour: Int,
    val startMinute: Int,
    val endHour: Int? = null,
    val endMinute: Int? = null,
    val origin: String,
    val destination: String,
    val serviceName: String? = null,
    val price: Double = 0.00
){

    fun getWeekDayStr() : String {
        return when(weekDay){
            0 -> "Dom"
            1 -> "Lun"
            2 -> "Mar"
            3 -> "Mie"
            4 -> "Jue"
            5 -> "Vie"
            6 -> "Sab"
            else -> "---"
        }
    }
}