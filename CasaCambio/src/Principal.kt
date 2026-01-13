import java.text.DecimalFormat

var tasaCambio = 0.0
var pesosEnCaja = 0.0
var dolaresEnCaja = 0.0

fun main() {
    print("Ingrese la tasa de cambio (pesos por dólar): ")
    tasaCambio = readln().toDouble()

    print("Ingrese la cantidad de pesos en caja: ")
    pesosEnCaja = readln().toDouble()

    print("Ingrese la cantidad de dólares en caja: ")
    dolaresEnCaja = readln().toDouble()

    controlOperaciones()

}

fun controlOperaciones() {
    print("ngrese la cantidad de dólares a cambiar: ")
    val dolaresACambiar = readln().toDouble()

    dolaresEnCaja += dolaresACambiar

    val pesoAEntregar = tasaCambio * dolaresACambiar

    pesosEnCaja -= pesoAEntregar

    val formato = "#,###.00"

    println("""
        *** Recibo ***
        Pesos a entregar: ${DecimalFormat(formato).format(pesoAEntregar)}
        
        
        Después del cambio:
        Pesos en caja: ${DecimalFormat(formato).format(pesosEnCaja)}
        Dólares en caja: ${DecimalFormat(formato).format(dolaresEnCaja)}
    """.trimIndent())

    controlOperaciones()
}
