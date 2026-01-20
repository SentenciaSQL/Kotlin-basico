import clase.Nota
import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(Nota.mostrarNumeroInstancias())

    val nota1 = Nota("A+", "Excelente trabajo en Kotlin usando Kotlin", Date())

    nota1.imprimirTotlaCaracteresNota()

    println(nota1.contarPalabrasContenido())

    println(nota1.contarPalabrasContenido("Kotlin"))

    println(Nota.mostrarNumeroInstancias())
}
