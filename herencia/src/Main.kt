import clases.Administrador
import clases.Empleado
import clases.Persona

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val persona = Persona("Juan", "Pérez", "Calle Falsa 123", "555-1234", "15/04/1990")
    println(persona)

    val empleado = Empleado("María", "Gómez", "Avenida Siempre Viva 742", null, "22/08/1985", 3500.0)
    println(empleado)

    val administrador = Administrador(
        "Carlos", "López", "Plaza Mayor 1", "555-5678", "30/12/1980", 5000.0, 10.0
    )
    println(administrador)
}
