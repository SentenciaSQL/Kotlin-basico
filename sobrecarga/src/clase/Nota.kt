package clase

import constantes.Constantes
import java.util.Date

class Nota(var nota: String, var contenido: String, fechaCreacion: Date) {

    init {
        numeroInstancias++

        if (nota.length > Constantes.LONGITUD_MAXIMA_NOTA) throw Exception("La longitud máxima de la nota es ${Constantes.LONGITUD_MAXIMA_NOTA}")
    }

    companion object {

        var numeroInstancias = 0

        fun mostrarNumeroInstancias() {
            println("Número de instancias creadas: $numeroInstancias")
        }
    }

    fun imprimirTotlaCaracteresNota() {
        println(contenido.length)
    }

    fun contarPalabrasContenido(): Int {
        val palabras = contenido.split(" ")

        return palabras.size
    }

    fun contarPalabrasContenido(palabra: String): Int {
        val palabras = contenido.split(" ")

        var contados = 0

        palabras.forEach {
            if(it == palabra) {
                contados++
            }
        }

        return contados
    }
}
