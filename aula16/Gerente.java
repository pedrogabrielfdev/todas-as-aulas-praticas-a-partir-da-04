public class Gerente extends Funcionario {

    // O construtor repassa os dados para a classe mãe usando o "super()"
    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }

    // Polimorfismo: Reescrevemos o método getSalario para o Gerente
    @Override
    public double getSalario() {
        // Retorna o salário base + 2000 de bonificação
        return super.getSalario() + 2000.00;
    }
}