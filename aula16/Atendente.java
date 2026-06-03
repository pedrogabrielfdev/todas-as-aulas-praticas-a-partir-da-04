public class Atendente extends Funcionario {
    private Double comissao;

    public Atendente(String nome, String cpf, double salario, String datanascimento, Double comissao) {
        super(nome, cpf, salario, datanascimento);
        this.comissao = comissao;
    }

    public Double getComissao() {
        return comissao;
    }
}
