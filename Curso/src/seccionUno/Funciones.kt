package seccionUno

import java.util.Date

val nombre = "Andres"

fun main() {
    // mostrarMensaje()
    //mostrarDatos("Juan Perez", 28)
    println(calcularImpuestos(10_000.0, 15.0))
    println(parametroOpcional(10_000.0))
}

fun mostrarMensaje(){
    println("""
        Mensaje: Hola desde Kotlin!
        Fecha: ${Date()}
    """.trimIndent())
}

fun mostrarDatos(nombre: String, edad: Int){
    println("""
        ***************
        *    Datos    *
        ***************
        Nombre: $nombre
        Edad: $edad
    """.trimIndent())
}

fun calcularImpuestos(salario: Double, porcentajeImpuestos: Double) : Double {
    val totalImpuestos = salario * (porcentajeImpuestos / 100)
    return totalImpuestos
}

fun parametroOpcional(salario: Double, porcentajeImpuestos: Double = 16.0) : Double {
    val totalImpuestos = salario * (porcentajeImpuestos / 100)
    return totalImpuestos
}

