fun main() {
    println("Bem vindo ao Bytebank!")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    /*println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)*/

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = Conta()
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular da conta joao: ${contaJoao.titular}")
    println("titular da conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

    class Conta {
        var titular = ""
        var numero = 0
        var saldo = 0.0

        fun testaLacos() {
            var i = 0;
            while (i < 5){
                val titular: String = "Alex $i"
                i++
            }

            for (i in 5 downTo 1){
                val titular: String = "Alex $i"
                val numeroConta: Int = 1000 + i
                var saldo: Double = i + 10.0

                println("titular $titular")
                println("número da conta $numeroConta")
                println("saldo conta $saldo")
                println()
            }
        }
    }