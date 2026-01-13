package curso

fun main() {
    //when1()
    when2()
}

fun when1() {
    val valor = readln().toInt()

    when(valor) {
        1 -> {
            println("El valor es uno")
        }
        2 -> {
            println("El valor es dos")
        }
        else -> {
            println("El valor no es ni uno ni dos")
        }
    }
}
fun when2() {
    val combustible = "gasolina"

    when(combustible) {
        "gasolina", "diesel" -> println("Utiliza gasolina o diesel")
        else -> println("Combustible no disponible")
    }
}
