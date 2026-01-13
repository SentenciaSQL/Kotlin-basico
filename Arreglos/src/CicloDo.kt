fun main() {
    println("ingrasa los nombres uno por uno y para terminar ingresa presiona enter\n")

    val listaEmpleados = arrayListOf<String>()

    do {
        print("Nombre: ")
        val nombre = readln().toString()
        listaEmpleados.add(nombre)
    } while (nombre != "")

    println("\nLos nombres ingresados son:\n")
    for (empleado in listaEmpleados) {
        println(empleado)
    }
}
