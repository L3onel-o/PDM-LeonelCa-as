
//Ejercicio de calculadora

class Calculadora(val marca: String, val aniosVida: Int, var precio: Double){

    //Funcion de mostrar informacion de la calculadora
    fun mostrarInformacion(){
        println("Informacion de la calculadora: Marca: $marca, Vida util: $aniosVida, Precio: $precio")
    }

    //Funcion de sumar
    fun sumar(num1:Double, num2:Double){
        val sum = num1 + num2
        println("El resultado de la suma es: $sum")
    }

    //Funcion de resta
    fun resta(num1:Double, num2:Double){
        val resta = num1 - num2
        println("El resultado de la resta es: $resta")
    }

    //Funcion de multiplicar
    fun multiplicacion(num1:Double, num2:Double){
        val multiplicacion = num1 * num2
        println("El resultado de la multiplicacion es: $multiplicacion")
    }

    //Funcion de division
    fun division(num1:Double, num2:Double){
        if (num2 == 0.0){
            println("La division no esta definida")
        } else {
            val division = num1 / num2
            println("El resultado de la division es: $division")
        }
    }

}

fun main() {

    var calculadora1 = Calculadora("Casio", 10, 53.0)

    do{
        var num1 = 0.0
        var num2 = 0.0

        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Ver informacion de la calculadora")
        println("6. Salir")

        print("Selecciona la opcion que quieres hacer: ")
        var opcion:Int = readln().toInt()
        if (opcion == 1) {
            print("Ingrese el numero 1: ")
            num1 = readln().toDouble()
            print("Ingrese el numero 2: ")
            num2 = readln().toDouble()
            calculadora1.sumar(num1, num2)

        } else if (opcion == 2) {
            print("Ingrese el numero 1: ")
            num1 = readln().toDouble()
            print("Ingrese el numero 2: ")
            num2 = readln().toDouble()
            calculadora1.resta(num1, num2)
        } else if (opcion == 3) {
            print("Ingrese el numero 1: ")
            num1 = readln().toDouble()
            print("Ingrese el numero 2: ")
            num2 = readln().toDouble()
            calculadora1.multiplicacion(num1, num2)
        } else if (opcion == 4) {
            print("Ingrese el numero 1: ")
            num1 = readln().toDouble()
            print("Ingrese el numero 2: ")
            num2 = readln().toDouble()
            calculadora1.division(num1, num2)
        } else if (opcion == 5) {
            calculadora1.mostrarInformacion()
        }

    } while(opcion != 6)
}