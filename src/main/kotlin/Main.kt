import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val sp = 67836.43
    val rj = 36678.66
    val mg = 29229.88
    val es = 27265.48
    val outros = 19849.53
    val acumuladoMensal = sp + rj + mg + es + outros

    println("São Paulo: ${obterMediaPercentual(sp, acumuladoMensal)}")
    println("Rio de Janeiro: ${obterMediaPercentual(rj, acumuladoMensal)}")
    println("Minas Gerais: ${obterMediaPercentual(mg, acumuladoMensal)}")
    println("Espírito Santo: ${obterMediaPercentual(es, acumuladoMensal)}")
    println("Outros: ${obterMediaPercentual(outros, acumuladoMensal)}")

}

fun obterMediaPercentual(elemento: Double, total: Double) : String {
    val mediaPecentual = (elemento * 100) / total
    return "${mediaPecentual.roundToInt()}%"
}

