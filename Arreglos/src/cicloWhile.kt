fun main() {
    println("ingrasa los nombres uno por uno y para terminar ingresa presiona enter\n")

    val listaEmpleados = arrayListOf<String>()

    print("Nombre: ")
    var nombre = readln().toString()

    while (nombre != "") {
        listaEmpleados.add(nombre)
        print("Nombre: ")
        nombre = readln().toString()
    }

    println("\nLos nombres ingresados son:\n")

    for (empleado in listaEmpleados) {
        println(empleado)
    }
}
