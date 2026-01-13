package ejeccicios

import kotlin.math.roundToInt

const val TARIFA_POR_KM = 2.25
const val DESCUENTO = 0.45

fun main() {
    try {
        print("Kilómetros del trayecto: ")
        val kilometros = readln().toDouble()

        print("Aplicar descuento: ")
        val aplicaDescueto = readln().lowercase()

        var total = kilometros * TARIFA_POR_KM

        if (aplicaDescueto == "si" || aplicaDescueto == "1") {
            total -=  total * DESCUENTO
        }

        val totalRedondeado = total.roundToInt()

        println("\nEl costo total del pasaje es: $$totalRedondeado")
    } catch (e: Exception) {
        println("Se deben ingresar los kilómetros del trayecto")
    }

}
