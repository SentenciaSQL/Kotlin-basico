import java.io.File
import java.io.FileNotFoundException

fun main() {
    try {
        val repeticiones = readln().toInt()
        val mensaje = File("C:\\Users\\PC\\Documents\\Kotlin\\mensaje.txt").readLines()[0]

        for (i in 0..<repeticiones) println(mensaje)
    } catch (e: FileNotFoundException) {
        println("No se pudo leer el archivo: ${e.localizedMessage}")
    } catch (e: NumberFormatException) {
        println("El valor debe ser un numero entero")
    } catch (e: Exception) {
        println("Ocurrio un error inesperado: ${e.localizedMessage}")
    }
}
