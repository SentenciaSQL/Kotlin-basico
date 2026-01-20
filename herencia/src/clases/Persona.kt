package clases

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

open class Persona(var nombre: String, var apellidos: String, var direccion: String, var telefono: String?, var fechaNacimientoTexo: String) {

    var fechaNacimientoDate: LocalDate = LocalDate.parse(fechaNacimientoTexo, DateTimeFormatter.ofPattern(FORMATO_FECHA))

    fun getEdad(): Int {
        return Period.between(fechaNacimientoDate, LocalDate.now()).years
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', apellidos='$apellidos', direccion='$direccion', telefono=${telefono ?: "N/D"}, fechaNacimientoTexo='$fechaNacimientoTexo', edad=${getEdad()})"
    }

    companion object {
        const val FORMATO_FECHA = "dd/MM/yyyy"
    }

}
