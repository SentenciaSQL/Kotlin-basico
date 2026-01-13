fun main() {
    val empleados = arrayOf("Ana", "Luis", "Carlos", "Marta", "Sofía")
    println(empleados[1])
    println(empleados.size)

    val intEmpleados = intArrayOf(101, 102, 103, 104, 105)
    println(intEmpleados[3])

    for (empleado in empleados) {
        println(empleado)
    }

    for (i in 0 until  empleados.size) {
        println(empleados[i])
    }

    for ((contador, empleado) in empleados.withIndex()) {
        println("Empleado $contador: $empleado")
    }

    for ((i, empleado) in empleados.withIndex()) {
        println("Empleado $i: $empleado")
    }

}
