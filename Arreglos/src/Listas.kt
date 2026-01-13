fun main() {
    val empleados = arrayListOf("Ana", "Luis", "Carlos", "Marta", "Sofía")

//    println(empleados.size)

    empleados.add("Jorge")

    empleados.sort()

    for (empleado in empleados) {
        println(empleado)
    }
    println("-------------------------------")

    // empleados.removeAt(3)
    empleados[3] = "María"

    for (empleado in empleados) {
        println(empleado)
    }


//    println(empleados.size)

    println("-------------------------------")

    empleados.forEach { empleado ->
        println(empleado)
    }

    println("-------------------------------")

    empleados.forEachIndexed {i, empleado ->
        println("Empleado $i: $empleado")
    }
}
