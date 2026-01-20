fun main() {
    println(calcularInteresPrestamos(readln().toDouble()));
}

fun calcularInteresPrestamos(valor: Double): Double {

    if (valor > 100_000.00) {
        throw Exception("El valor del prestamo no puede ser mayor a 100,000.00");
    }


    return valor * 0.10;
}
