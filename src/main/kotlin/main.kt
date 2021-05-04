fun main() {
    println("Bem vindo ao Bytebank!")
    var i = 0;
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("número da Conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++

        loop@ for (i in 1..100) {
            println("i $i")
            for (j in 1..100) {
                println("j $j")
                if (j == 5) break@loop
            }
        }

        /* for (i in 5 downTo 1){
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
    }

    testaCondicoes(saldo)
*/
    }

    fun testaCondicoes(saldo: Double) {
        if (saldo > 0.0) {
            println("conta é positiva")
        } else if (saldo == 0.0) {
            println("conta é neutra")
        } else {
            println("conta é negativa")
        }

    }


}