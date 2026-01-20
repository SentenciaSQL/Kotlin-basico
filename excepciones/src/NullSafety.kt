fun main() {


    val entrada = readln()

    val lado = entrada.toDoubleOrNull()

    lado?.let {
        val resultado = it * it
        println(resultado)
    }

    println("Finalizado")


}
