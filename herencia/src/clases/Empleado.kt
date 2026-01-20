package clases

open class Empleado(
    nombre: String,
    apellidos: String,
    direccion: String,
    telefono: String?,
    fechaNacimientoTexo: String,
    var salario: Double
) : Persona(nombre, apellidos, direccion, telefono, fechaNacimientoTexo
) {
    override fun toString(): String {
        return super.toString() + ", Empleado(salario=$salario)"
    }

}
