package ejeccicios

fun main() {
    val numeros = arrayListOf<Double>()
    var input = readln().toDouble()

    var suma = 0.0

    while (input != 0.0) {
        numeros.add(input)
        input = readln().toDouble()
    }

    for (numero in numeros) {
        suma += numero
    }

    val promedio = suma / numeros.size

    println("Sumatoria: $suma")
    println("Promedio: $promedio")
}
