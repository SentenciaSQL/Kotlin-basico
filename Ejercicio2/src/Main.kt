enum class TipoElectrodomestico {
    LAVADORA, MICROONDAS, REFRIGERADOR
}

enum class Color {
    BLANCO, NEGRO, GRIS
}

abstract class Electrodomestico(
    val numeroSerie: String,
    val tipo: TipoElectrodomestico,
    val color: Color,
    val peso: Double,
    val precio: Double
) {
    companion object {
        var totalFabricados: Int = 0
            private set
    }

    init {
        totalFabricados++
    }
}

class Lavadora(
    numeroSerie: String,
    color: Color,
    peso: Double,
    precio: Double,
    val capacidadKg: Double
) : Electrodomestico(numeroSerie, TipoElectrodomestico.LAVADORA, color, peso, precio) {

    override fun toString(): String {
        return """
            Lavadora
            - Serie: $numeroSerie
            - Tipo: $tipo
            - Color: $color
            - Peso: $peso kg
            - Precio: $$precio
            - Capacidad: $capacidadKg kg
        """.trimIndent()
    }
}

class Microondas(
    numeroSerie: String,
    color: Color,
    peso: Double,
    precio: Double,
    val potenciaWatts: Int
) : Electrodomestico(numeroSerie, TipoElectrodomestico.MICROONDAS, color, peso, precio) {

    override fun toString(): String {
        return """
            Microondas
            - Serie: $numeroSerie
            - Tipo: $tipo
            - Color: $color
            - Peso: $peso kg
            - Precio: $$precio
            - Potencia: $potenciaWatts W
        """.trimIndent()
    }
}

class Refrigerador(
    numeroSerie: String,
    color: Color,
    peso: Double,
    precio: Double,
    val capacidadPiesCubicos: Double,
    val tempMinConservadorC: Double,
    val tempMinCongeladorC: Double
) : Electrodomestico(numeroSerie, TipoElectrodomestico.REFRIGERADOR, color, peso, precio) {

    override fun toString(): String {
        return """
            Refrigerador
            - Serie: $numeroSerie
            - Tipo: $tipo
            - Color: $color
            - Peso: $peso kg
            - Precio: $$precio
            - Capacidad: $capacidadPiesCubicos ft³
            - Temp. mín. conservador: $tempMinConservadorC °C
            - Temp. mín. congelador: $tempMinCongeladorC °C
        """.trimIndent()
    }
}

fun main() {
    val lavadora = Lavadora(
        numeroSerie = "LAV-001",
        color = Color.BLANCO,
        peso = 65.5,
        precio = 450.0,
        capacidadKg = 18.0
    )

    val microondas = Microondas(
        numeroSerie = "MIC-010",
        color = Color.NEGRO,
        peso = 12.0,
        precio = 120.0,
        potenciaWatts = 1100
    )

    val refrigerador = Refrigerador(
        numeroSerie = "REF-100",
        color = Color.GRIS,
        peso = 90.0,
        precio = 850.0,
        capacidadPiesCubicos = 14.5,
        tempMinConservadorC = 2.0,
        tempMinCongeladorC = -18.0
    )

    val electrodomesticos: Array<Electrodomestico> = arrayOf(lavadora, microondas, refrigerador)

    electrodomesticos.forEach {
        println(it)
        println("--------------------------------------------------")
    }

    println("Total de electrodomésticos fabricados: ${Electrodomestico.totalFabricados}")
}
