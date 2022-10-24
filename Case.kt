//use of when with function
fun main() {
    println(getTriMonthByMonth(6))
    println(getMonth(6))
    println(getSemesterByMonth(6))
    println(whatTypeVariableIs(12))
 
 }
 
 fun getMonth(mes:Int):String{
  //is possible to add return before to when or even before each month on string, example return"enero"
  return when(mes){
      1->"Enero"
      2->"Febrerp"
      3->"Marzo"
      4->"Abril"
      5->"Mayo"
      6->"Junio"
      7->"Julio"
      8->"Agosto"
      9->"Septiembre"
      10->"Octubre"
      11->"Noviembre"
      12->"Diciembre"
      else->"No month"
  }   
 }
 
 fun getTriMonthByMonth(mes:Int):String{
  //is possible to add return before to when or even before each month on string, example return"enero"
  return when(mes){
      1,2,3->"Primer trimestre"
      4,5,6->"Segundo trimestre"
      7,8,9->"Tercer trimestre"
      10,11,12->"Cuarto trimestre"
      else->"No valid month"
  }   
 }
 
 fun getSemesterByMonth(mes:Int):String{
  //is possible to add return before to when or even before each month on string, example return"enero"
  return when(mes){
      in 1..6->"Primer trimestre"
      in 7..12->"Segundo trimestre"
      !in 1..12->"No valid month"
      else->"No expecter number"
  }   
 }
 
 fun whatTypeVariableIs(tipo:Any):String{
     return when(tipo){
         is String-> "String"
         is Int-> "Int"
         is Boolean->"Boolean"
         else ->"Type no found"
     }
 }