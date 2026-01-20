package clases

import java.util.*

class Nota (
    var nombre: String,
    var contenido: String ,
    var fechaCreacion: Date
) {

    init {
        nombre = nombre.uppercase();
    }

    constructor(nombre: String, contenido: String) : this(
        nombre,
        contenido,
        Date()
    ) {
        println("Nota creada el: $fechaCreacion")
    }
}
