package curso

fun main() {
    val edad = readln().toInt()

    when (edad) {
        in 0..12 -> println("Niño")
        in 13..19 -> println("Adolescente")
        in 20..64 -> println("Adulto")
        in 65..120 -> println("Adulto mayor")
        else -> println("Edad no válida")
    }

    val mensajeResultado = when (edad) {
        in 0..12 -> "Niño"
        in 13..19 -> "Adolescente"
        in 20..64 -> "Adulto"
        in 65..120 -> "Adulto mayor"
        else -> "Edad no válida"
    }

    println(mensajeResultado)

    val valor: Any = 1L

    when(valor) {
        is Int -> println("Es un entero")
        is Long -> println("Es un long")
        is String -> println("Es una cadena")
        else -> println("Tipo desconocido")
    }
}
