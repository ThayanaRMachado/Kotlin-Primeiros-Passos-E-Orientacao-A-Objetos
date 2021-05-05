fun main() {
    println("Bem vindo ao Bytebank")

    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente ${contaCorrente.saldo}")
    println("Saldo poupança ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo corrente após saque ${contaCorrente.saldo}")
    println("Saldo poupança após saque ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("Saldo corrente após tranferir para a poupança ${contaCorrente.saldo}")
    println("Saldo poupança após receber transferência ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)
    println("Saldo poupança após tranferir para a corrente ${contaPoupanca.saldo}")
    println("Saldo corrente após receber transferência ${contaCorrente.saldo}")
}