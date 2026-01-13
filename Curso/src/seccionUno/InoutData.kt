package seccionUno

fun main() {
    println("ingresa tu nombre: ")
    val nombre = readlnOrNull()

    println("ingresa tu edad: ")
    val edad = readlnOrNull()

    println("Tu nombre es: $nombre y tu edad es: $edad")

    println("""
        ***************
        *    Datos    *
        ***************
        Nombre: $nombre
        Edad: $edad
    """.trimIndent())
}
