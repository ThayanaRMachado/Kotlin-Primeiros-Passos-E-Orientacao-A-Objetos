fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-09",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salário ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "123.456.789-00",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salário ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if (gui.autentica(4000)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação")
    }

    val maria = Analista(
        nome = "Maria",
        cpf = "345.765.876-00",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de bonificação ${calculadora.total}")
}