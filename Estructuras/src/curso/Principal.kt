package curso

var sesionIniciada = false

fun main() {
    if (sesionIniciada != false) {
        println("Sesión iniciada, bienvenido de nuevo")
    } else {
        println("Por favor, inicie sesión")
    }
}
