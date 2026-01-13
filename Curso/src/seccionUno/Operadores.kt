package seccionUno

import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

fun main() {
    var numero = 10

    // aritmeticos
    val suma = numero + 10
    println(suma)

    val resta = numero - 5
    println(resta)

    val multiplicacion = numero * 2
    println(multiplicacion)

    val division = numero / 2
    println(division)

    val modulo = numero % 3
    println(modulo)

    // asignacion
    numero += 5
    println(numero)

    // redondeo

    val pi = 3.1416
    println(round(pi))
    println(round(pi).toInt())
    println(floor(pi).toInt())
    println(ceil(pi).toInt())

    println(DecimalFormat("#.##").format(pi))

}
