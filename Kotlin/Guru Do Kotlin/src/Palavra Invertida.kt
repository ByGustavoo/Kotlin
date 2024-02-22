fun main() {

    // Inicializa a variável para armazenar a palavra
    println("\n**************************************")
    println("Digite qualquer palavra para inverter: ")
    val palavra = readln()

    //Inverte a palavra usando o .reversed()
    val palavraInvertida = palavra.reversed()

    //Mostra a palavra invertida
    println("\nA palavra $palavra invertida fica: " + palavraInvertida)
}