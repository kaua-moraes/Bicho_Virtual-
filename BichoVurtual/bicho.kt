class Bicho { 
    
    var nome = 'bilu bilu'
    var nivelFelicidade = 50
    var nivelFome = 50 
    var perdeu = false 

    fun alimentar() {
        nivelDefome -= 10
        println ("$nome foi alimentado. O nivel de fome diminuiu.")
    }

    fun brincar(){
        nivelFelicidade += 10 
        println ("$nome está brincando e se sentindo muito mais feliz.")
    }

    fun verificarStatus() {
        Println("Status atual de $noem:")
        println("Nivel de fome: $nivelDeFome")
        println("Nivel de felicidade: $nivelFelicidade")
    }

    fun passarTempo(){
        nivelDeFome += 5 
        println("$Nome está mais faminto com o passar do tempo.")
  }
  
}