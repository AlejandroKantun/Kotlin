// Lists
// there are two kinds of lists, mutable and immutable list
fun main() {
    val weeklyDays:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    //access like Arryas
    println(weeklyDays.size)
    println(weeklyDays[2])
    println(weeklyDays.first())
    println(weeklyDays.last())
 
    //MutableList
    val weeklyDays1:MutableList<String> = mutableListOf()
    // adding data to list
    weeklyDays1.add("Lunes")
    weeklyDays1.add("Martes")
    weeklyDays1.add("miercoles")
    //access like Arryas
    println(weeklyDays1.size)
    println(weeklyDays1[2])
    println(weeklyDays1.first())
    println(weeklyDays1.last())
    
    //You can push the data by inserting an element at the beggining or another position, like next
    weeklyDays1.add(0,"Semana :")
    println(weeklyDays1)
    
    //filter, itererate thru each elements,
    //it, is the variable for each elements
    var result = weeklyDays1.filter{ it[0].lowercaseChar() == 'm' }
    println(result)
    
    var emptyDays:MutableList<String> = mutableListOf()
    println(emptyDays)
    weeklyDays1.forEach{
        emptyDays.add(it+": ")
    }
    println(emptyDays)
 }