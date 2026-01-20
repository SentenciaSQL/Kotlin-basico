import clases.EstadoTarea
import clases.Tarea

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /*
    val rectangulo = clases.Rectangulo("Rectangulo 1",5.0, 3.0)
    println("Área del rectángulo: ${rectangulo.area()}")
    println("Perímetro del rectángulo: ${rectangulo.perimetro()}")

    println("Área del rectángulo en pulgadas: ${rectangulo.areaPulgadas()}")
    println("Perímetro del rectángulo en pulgadas: ${rectangulo.perimetroPulgadas()}")

    rectangulo.dibujar()
    */

    val listaTareas = arrayListOf(
        Tarea("Comprar comida", EstadoTarea.PENDIENTE),
        Tarea("Lavar el auto", EstadoTarea.EN_PROGRESO),
        Tarea("Pagar facturas", EstadoTarea.COMPLETADA)
    )

    var tareasPendientes = 0

    listaTareas.forEach {
        if (it.estado == EstadoTarea.PENDIENTE) tareasPendientes++
    }

    println("Número de tareas pendientes: $tareasPendientes")

}
