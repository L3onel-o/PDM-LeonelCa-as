//Ejercicio de estudiante

class Estudiante(val nombreEstudiante:String, val carnet:String, var materia:String)

fun verEstudiantes(lista: List<Estudiante>){

    for (estudiante in lista){
        println("Nombre: ${estudiante.nombreEstudiante} | Carnet: ${estudiante.carnet} | Materia: ${estudiante.materia}")
    }


}

fun main() {

    val Ciclo01 = mutableListOf<Estudiante>()

    val estudiante1 = Estudiante("Leonel", "00145424", "Dispositivos moviles")
    val estudiante2 = Estudiante("Julian", "00144023", "Dispositivos moviles")
    val estudiante3 = Estudiante("Messi", "00013421", "Dispositivos moviles")

    val estudiante4 = Estudiante("Ana", "00202625", "Analisis numerico")
    val estudiante5 = Estudiante("Luis", "00202624", "Analisis numerico")
    val estudiante6 = Estudiante("Elena", "00202619", "Analisis numerico")
    val estudiante7 = Estudiante("Majo", "00202623", "Analisis numerico")

    Ciclo01.add(estudiante1)
    Ciclo01.add(estudiante2)
    Ciclo01.add(estudiante3)
    Ciclo01.add(estudiante4)
    Ciclo01.add(estudiante5)
    Ciclo01.add(estudiante6)
    Ciclo01.add(estudiante7)

    println("==Estudiantes del ciclo01==")
    verEstudiantes(Ciclo01)

    println("==Estudiantes solo de la materia Dispositivos moviles==")
    val alumnosMoviles = Ciclo01.filter { estudiante -> estudiante.materia == "Dispositivos moviles" }

    verEstudiantes(alumnosMoviles)
}