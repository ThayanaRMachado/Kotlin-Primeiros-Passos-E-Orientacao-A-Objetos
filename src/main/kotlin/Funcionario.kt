abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    abstract open val bonificacao: Double
}