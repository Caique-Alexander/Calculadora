import kotlin.math.pow

fun main(args: Array<String>) {

    println(subtracao(10, 6))
    println(soma(8, 7))
    println(multiplicacao(3, 5))
    println(divisao(1000, 2))
    println(potencia(9.0, 4.0))

}

fun subtracao(num1: Int, num2: Int) {
    val result = num1 - num2
    println("$num1 - $num2 = $result")
}

fun soma(num1: Int, num2: Int) {
    val result = num1 + num2
    println("$num1 + $num2 = $result")

}

fun multiplicacao(num1: Int, num2: Int) {
    val result = num1 * num2
    println("$num1 X $num2 = $result")

}

fun divisao(num1: Int, num2: Int) {
    val result = num1 / num2
    println("$num1 / $num2 = $result")

}

fun potencia(num1: Double, num2: Double) {
    val result = num1.pow(num2)
    println("$num1 ^ $num2 = $result")

}