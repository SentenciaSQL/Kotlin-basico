package clases

abstract class Poligono(var identifigador: String) {

    abstract fun area(): Double
    abstract fun perimetro(): Double
    abstract fun dibujar()

    protected  fun centimetrosAPulgadas(valor: Double) : Double {
        return valor / 2.54
    }

}
