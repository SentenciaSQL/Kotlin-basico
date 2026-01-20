package clases

class Cuenta(var cable: String, var titular: String, var saldo: Double) {

    fun depositar(monto: Double) {
        if (monto > 0) {
            saldo += monto
            println("Depósito exitoso de $$monto. Nuevo saldo: $$saldo")
        } else {
            println("El monto a depositar debe ser positivo.")
        }
    }

    fun retirar(monto: Double) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto
            println("Retiro exitoso de $$monto. Nuevo saldo: $$saldo")
        } else {
            println("El monto a retirar ($$monto) no puede ser mayor que el saldo disponible ($$saldo)\nNo se pudo realizar la accion solicitada.")
        }
    }

}
