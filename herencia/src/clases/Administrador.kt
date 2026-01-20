package clases

class Administrador (
    nombre: String,
    apellidos: String,
    direccion: String,
    telefono: String?,
    fechaNacimientoTexo: String,
    salario: Double,
    var porcentajeBonificacion: Double
) : Empleado(nombre, apellidos, direccion, telefono, fechaNacimientoTexo, salario
) {

    fun obtenerSalarioFinal(): Double {
        return salario + (salario * porcentajeBonificacion / 100)
    }

    override fun toString(): String {
        return super.toString() + ", Administrador(porcentajeBonificacion=$porcentajeBonificacion, salarioFinal=${obtenerSalarioFinal()})"
    }

}
