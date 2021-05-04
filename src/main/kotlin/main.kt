fun main(){
    println("Bem vindo ao Bytebank!")
    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo -=100
    saldo = 0.0

    println("titular $titular")
    println("número da conta $numeroConta")
    println("Saldo da conta $saldo")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }

    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0){
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }
}