package clases

import kotlin.math.roundToInt

class Rectangulo(identifigador: String, var base: Double, var altura: Double) : Poligono(identifigador){

    override fun area(): Double {
        return base * altura
    }

    override fun perimetro(): Double {
        return (2 * base) + (2 * altura)
    }

    override fun dibujar() {
       for (i in 1..altura.roundToInt()) {
           println("* ".repeat(base.roundToInt()))
       }
    }

    fun areaPulgadas(): Double {
        return centimetrosAPulgadas(area())
    }

    fun perimetroPulgadas(): Double {
        return centimetrosAPulgadas(perimetro())
    }
}
