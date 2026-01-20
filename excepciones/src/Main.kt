//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    try {
        val valor = readln().toDouble()
        println(valor)
    } catch (e: Exception) {
        println("El valor debe ser un numero");
        main();
    }
}
