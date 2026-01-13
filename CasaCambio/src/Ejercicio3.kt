fun main() {
    print("Ingresa el radio en centímetros: ")
    val radio = readln().toDouble()

    val areaCirculo = area(radio)
    val circunferenciaCirculo = circunferencia(radio)

    val areaInches = cmAIn(areaCirculo)
    val circunferenciaInches = cmAIn(circunferenciaCirculo)

    val formato = "%.2f"

    println("""
        *** Centimetros ***:
        Área: ${formato.format(areaCirculo)}
        Circunferencia: ${formato.format(circunferenciaCirculo)}

        *** Pulgadas ***::
        Área: ${formato.format(areaInches)}
        Circunferencia: ${formato.format(circunferenciaInches)}
    """.trimIndent())

}

fun area(radio: Double): Double {
    return Math.PI * radio * radio
}

fun circunferencia(radio: Double): Double {
    return 2 * Math.PI * radio
}

fun cmAIn(cm: Double): Double {
    return cm / 2.54
}
