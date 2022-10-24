fun main() {
    val animal = "pajaro"
    val raza = "labrador"
        if(animal=="perro"){println("perro")}
        else if (animal =="pajaro"){println("pajaro")}
        else{println("no es algun animal")}
        
        if ((animal=="perro" && raza=="labrador")||animal=="pajaro"){println("Es uno de mis animales")}
        else {println("no es uno de mis animales")}
    }