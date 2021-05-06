fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "234.654.876-09",
        salario = 1000.0,
        senha = 1000
    )

    val diretora = Diretor(
        nome = "Fran",
        cpf = "123.123.123-12",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
}