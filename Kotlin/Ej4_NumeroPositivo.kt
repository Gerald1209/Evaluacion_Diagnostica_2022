/*Cree una función que permita ingresar un valor entero positivo comprendido entre 1 y
10000 e imprimir un mensaje indicando cuantos dígitos tiene.*/
fun main() {
    var num: Int
    do{
        println("Introduzca un numero entre 1 y 10000: ")
        num = readLine()!!.toInt()
         if(num < 1 || num > 10000){
             println("Valor invalido. Intente de nuevo")
         }
    }while(num < 1 || num > 10000)

    val cant= num.toString().length
    println("Los dígitos tiene $num son $cant")
 }