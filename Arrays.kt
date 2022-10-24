// ARRAYS
// 
fun main() {
    val weeklyDays = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    //Arrays has a size that can´t be modified
    println(weeklyDays[2])
    //you can modify items with next sentence
    weeklyDays.set(2,"Miernes")
    println(weeklyDays[2])
    
    if(weeklyDays.size ==7){println(weeklyDays[6])}
    
    //you can create a loopp with the array
    weeklyDays.forEach{
        //it is variable iterator wich stores each day 
        if (it =="Jueves"){println("Por fin jueves")}
        println(it)
        
        
    }
    //you can access to first and last element within array like next code
    println(weeklyDays.first())
    println(weeklyDays.last())
 
 }