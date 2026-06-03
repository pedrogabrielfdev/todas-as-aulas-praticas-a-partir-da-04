public class Funcionario {
    private String nome;
    protected String cpf;
    private double salario;
    private String datanascimento;


    public Funcionario(String nome, String cpf, double salario, String datanascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.datanascimento = datanascimento;
    }
    public double getSalario() {
        return salario;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }

}

