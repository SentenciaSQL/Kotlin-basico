package ejeccicios

fun main() {
    val alumnos = arrayOf("José", "Alberto", "Laura", "Noel", "Erika", "Daniel")

    val calificaciones = doubleArrayOf(31.0, 94.0, 98.5, 75.0, 46.5, 75.0)

    var suma  = 0.0
    var calificacionAlta = Double.MIN_VALUE
    var calificacionBaja = Double.MAX_VALUE

    val reprobadors = arrayListOf<Map<String, Double>>()

    for (i in calificaciones.indices) {
        val nota = calificaciones[i]
        suma += nota

        if (nota > calificacionAlta) {
            calificacionAlta = nota
        }

        if (nota < calificacionBaja) {
            calificacionBaja = nota
        }

        if (nota < 60) {
            reprobadors.add(mapOf(alumnos[i] to nota))
        }

    }

     val promedio = suma / calificaciones.size
     println("Promedio de calificación: $promedio\n")
     println("Calificación más alta: $calificacionAlta")
     println("Calificación más baja $calificacionBaja\n")

     println("Reprobados:")
     for (reprobado in reprobadors) {
        for ((nombre, calificacion) in reprobado) {
            println("$nombre, $calificacion")
        }
     }
}
