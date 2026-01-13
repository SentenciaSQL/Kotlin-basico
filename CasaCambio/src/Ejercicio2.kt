import java.text.DecimalFormat

fun main() {
    print("Salario mensual bruto: ")
    val salarioBruto = readln().toDouble()

    print("Impuesto mensual (porcentaje): ")
    val impuestoPorcentaje = readln().toDouble()

    val salarioNeto = salarioBruto * (1 - impuestoPorcentaje / 100)

    val impuestosMensuales = salarioBruto - salarioNeto

    val salarioAnualNeto = salarioNeto * 12

    val impuestosAnuales = impuestosMensuales * 12

    val formato = "#,###.00"

    println("""
        Salario mensual neto: ${DecimalFormat(formato).format(salarioNeto)}
        Impuestos a pagar por mes: ${DecimalFormat(formato).format(impuestosMensuales)}
        
        Salario anual neto: ${DecimalFormat(formato).format(salarioAnualNeto)}
        Impuestos a pagar por año: ${DecimalFormat(formato).format(impuestosAnuales)}
    """.trimIndent())
}
