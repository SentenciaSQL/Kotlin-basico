fun main() {
    for (i in 1..5) {
        println("Número: $i")
    }

    val valores = intArrayOf(10, 20, 30, 40, 50)

    var sumatoria = 0

    for (i in  0 until valores.size) {
        sumatoria += valores[i]
    }

    println("Sumatoria: $sumatoria")

    for (i in 1..10 step 2) {
        println("Número impar: $i")
    }
}
