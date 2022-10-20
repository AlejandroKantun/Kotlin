

fun main() {
    println("Hello, world!!!")
/**
 * there are differents types of variables, if you dont stablish the type of variable, 
 * kotlin could define the type, is a good practice tow  write the variable
 *
 */
//Variable string
var name = "Hey"

//var is the reserved word to declare variables follow by name and equals to the current value
//NUMERIC VARIABLES
//Integer , variables de números reales, enteros -2,147,483,647 to 2,147,483,647
var edad:Int = 27

//long  , -9,223,372,036,854,775,807 to 9,223,372,036,854,775,807
var edad2:Long = 27

//Float , to use decimal variables, its required to add a "f" at the end, supports 6 decimals
var edad3:Float = 56.4f
//Double, allows use 12 decimal digits, dont require f at the end, takes a lot of memory
var edad4:Double = 12.1244531

//STRINGS
//Char between simple quotes
var letra:Char = '#'

//String between double quotes
var nombreEdad:String="Hola, me llamo Alejandro y tengo 27 años"

//Boolean, true or false ,0 or 1, simple conditions
var estoyfeliz:Boolean = true
    
//val, define a constant value, cannot be ovewritten during run time
val test:String = "Hola"
        println("Hello, $test!!")

        var edad:Int = 27
        var numeroFavorito:Int = 25
        println ("Sumar:")
        println(numeroFavorito + edad)
        
        println ("Restar:")
        println (numeroFavorito - edad)
        
        println ("Multiplicar:")
        println (numeroFavorito * edad)
    
        println ("Dividir:")
        println (numeroFavorito / edad)
        
        println ("Modulo:")
        println (numeroFavorito % edad)
        
        val resultado = numeroFavorito + edad
        println(resultado)
        
        var edadString:String ="27"
        val resultadoAddWithString = edadString.toInt() + numeroFavorito 
        val name:String="AlexK"
        // to made operations with string to int, is necesario make a String to Int
        // if we add two string and uses + then both will be concatenated
        println(resultado)
        
        println("Hola mi nombre es "+name+" y tengo $edadString años")

}