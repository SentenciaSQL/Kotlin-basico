//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val cuenta = clases.Cuenta("01-8547-9", "Alberto Palma", 5000.0)

    println("Seleccione una opción: 1) Depositar 2) Retirar")
    val opcion = readln().toInt()

    when (opcion) {
        1 -> {
            try {
                print("Monto a depositar:")
                val montoDeposito = readln().toDouble()
                cuenta.depositar(montoDeposito)
            } catch (e: NumberFormatException) {
                println("Monto incorrecto.")
            }
        }
        2 -> {
            try {
                print("Monto a retirar:")
                val montoRetiro = readln().toDouble()
                cuenta.retirar(montoRetiro)
            } catch (e: NumberFormatException) {
                println("Monto incorrecto.")
            }
        }
        else -> {
            println("Opción inválida.")
        }
    }
    main()
}
