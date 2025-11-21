fun main() {
    println("Bem-vindo ao simulador de Animal de estimação Virtual!")
    println("Digite o nome do seu amigo virtual:")

    val nomePet = readln() ?: "Bilubilu"
    val pet = BichoVirtual()

    while (true) {
        println("\nEscolha uma ação:")
        println("1. Alimentar $nomePet")
        println("2. Brincar com $nomePet")
        println("3. Vereficar o status de $nomePet")
        println("4. Sair")

        var escolha = readLine()/?.toIntOrNull() ?: continue 

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> pet.verificarStatus()
            4 -> {
                println("Saindo do simulador. Adeus!")
            }
            else -> println("Escolha inválida. Tente novamente.")

        }
        pet.passarTempo() // Simula o que passa após cada ação
    }
}