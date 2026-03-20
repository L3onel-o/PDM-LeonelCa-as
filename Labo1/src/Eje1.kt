class Computadora(var ram: Int, var memoria: Int, var sistemaOperativo: String, val tipoComputadora: String){

    //Funcion de encendido
    fun encender(){
        println("La computadora ha sido encendida")
    }

    //Funcion para apagarla
    fun apagar(){
        println("La computadora ha sido apagada")
    }

    //Pienso que mutable ya que vamos a eliminar y agregar apps en el futuro
    var listaProgramasInstalados = mutableListOf("Tik tok 2022", "BeReal 2026", "Facebook 2010",
                                                 "Youtube 2008", "Instagram 2026" )

    fun programasRecientes(){
        val appsSegunAnio = listaProgramasInstalados.filter { texto -> texto.contains("2026") }

        println(appsSegunAnio)
    }

    fun mostrarEspecificaciones(){
        println("Especificaciones de la computadora: Ram : $ram Memoria: $memoria GB, " +
                "Sistema Operativo : $sistemaOperativo")
    }
}

fun main() {

    var computadora1 = Computadora(16, 1000, "Windows", "Laptop")
    computadora1.encender()
    computadora1.mostrarEspecificaciones()
    computadora1.programasRecientes()
    computadora1.apagar()

    println("==Modificando la computadora==")

    computadora1.encender()
    computadora1.ram = 32
    computadora1.memoria = 2000
    computadora1.sistemaOperativo = "Linux"
    computadora1.mostrarEspecificaciones()
    computadora1.apagar()

}