fun main() {
    println(esNumero(readln()))
}

fun esNumero(valor: Any): Boolean {
   val resultado = try {
        valor.toString().toDouble();
         true;
   }catch (e: Exception) {
         false;
   }
    return resultado;
}
