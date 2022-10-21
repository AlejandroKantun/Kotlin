fun main() {
    //diferent ways to pass values tru functions
    sumar(27,25)
    sumar (edad = 24)
    sumar (numeroFavorito=12, edad = 43)
    
    //call functions with return objects
    val resta= restar()
    println("La resta es: " + resta)

}

//funtion with return object
//The way of return many features in a function is created objects
fun restar():Int{
    val edad:Int = 27
    val numeroFavorito = 25
    val resultado = edad - numeroFavorito
    return resultado
}

//another way to write
fun multiplicar():Int{
    val edad:Int = 27
    val numeroFavorito = 25
    return  edad - numeroFavorito
}
//another way to write in oneline
fun quickSum(edad:Int = 27,numeroFavorito:Int = 25):Int =  edad - numeroFavorito



fun sumar (edad:Int ,numeroFavorito:Int = 25){ //give an equal value on parameter mean that is optional, if it is no
    //provided , then will use the preset value 
    
   val resultado = edad + numeroFavorito
   println(resultado)
}

