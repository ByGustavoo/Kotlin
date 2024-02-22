fun main() {

    // Inicializa a variável para armazenar os números
    println("**************************************")
    println("Digite um número (Digite 0 para sair): ")
    var num = readLine()!!.toInt()

    // Variável de somar todos os números
    var soma = 0

    // Variável para guardar a quantidade dos números digitados
    var numQuantidade = 0

    // Variável para calcular a média dos números digitados
    var mediaNum = 0

    // Variável para guardar o maior número digitado
    var maiorNum = Int.MIN_VALUE

    // Variável para guardar o menor número digitado
    var menorNum = Int.MAX_VALUE

    // Variáveis para guardar a soma e a quantidade dos números pares
    var somaPares = 0
    var numParesQuantidade = 0

    // Variável para guardar a quantidade de números ímpares digitados
    var imparQuantidade = 0

    do {
        println("Digite um número (Digite 0 para sair): ")

        // Verifica se o número digitado é diferente de zero
        if (num > 0)
            soma += num
            numQuantidade++

        // Atualiza o maior número
        if (num > maiorNum) {
            maiorNum = num
        }

        // Atualiza o menor número
        if (num < menorNum) {
            menorNum = num
        }

        // Verifica se o número é par
        if (num % 2 == 0) {
            somaPares += num
            numParesQuantidade++
        }

        // Verifica se o número é ímpar
        if (num % 2 == 1) {
            imparQuantidade++
        }

        // Lê um novo número para a próxima iteração
        num = readLine()!!.toInt()

    } while (num != 0)

    println("\nVocê saiu do laço!")
    println("A soma de todos os números: $soma")
    println("A quantidade de números digitados: $numQuantidade")
    println("A média dos números digitados: ${calcularMedia(soma, numQuantidade)}")
    println("O maior número digitado: $maiorNum")
    println("O menor número digitado: $menorNum")
    println("A média dos números pares digitados: ${calcularMediaPares(somaPares, numParesQuantidade)}")
    println("A quantidade dos números ímpares digitados: $imparQuantidade")
}

// Função para calcular a média dos números digitados
fun calcularMedia(soma: Int, numQuantidade: Int): Double {
    return (soma / numQuantidade).toDouble()
}

// Função para calcular a média dos nímeros pares digitados
fun calcularMediaPares(somaPares: Int, numParesQuantidade: Int): Double {
    return (somaPares / numParesQuantidade).toDouble()
}