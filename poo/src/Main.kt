
import clases.Nota
import java.util.*

fun main() {
    val nota1 = Nota("Comprar comestibles", "Leche, Pan, Huevos, Frutas", Date())

    val nota2 = Nota("Recordatorio de reunión", "Reunión con el equipo a las 10 AM")

    val listaNotas = arrayListOf<Nota>()

    listaNotas.add(nota1)
    listaNotas.add(nota2)

    listaNotas.forEach{
        println("Nombre: ${it.nombre}")
        println("Contenido: ${it.contenido}")
        println("Fecha de Creación: ${it.fechaCreacion}")
        println("-----")
    }

    Avoin();


}

open class Aeronave(var numeroPasajero: Int) {}

class Avoin : Aeronave(50) {
    init {
        println(numeroPasajero)
    }
}

