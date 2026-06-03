import java.util.Scanner;
import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Gerente");
            System.out.println("2. Cadastrar Atendente");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("4. Mostrar o salario do funcionario (por CPF)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = ler.nextInt();
            ler.nextLine(); // Limpar 

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do gerente:");
                    String nomeGerente = ler.nextLine();
                    System.out.println("Digite o CPF do gerente:");
                    String cpfGerente = ler.nextLine();
                    System.out.println("Digite o salário base:");
                    double salarioGerente = ler.nextDouble();
                    ler.nextLine(); // Limpar
                    System.out.println("Digite a data de nascimento:");
                    String dataNascimentoGerente = ler.nextLine();
                    Gerente gerente = new Gerente(nomeGerente, cpfGerente, salarioGerente, dataNascimentoGerente);
                    listaFuncionarios.add(gerente);
                    System.out.println("Gerente cadastrado com sucesso!");
                    break; // <-- ADICIONADO AQUI! Diz para o programa sair do switch.

                case 2:
                    System.out.println("Digite o nome do atendente:");
                    String nomeAtendente = ler.nextLine();
                    System.out.println("Digite o CPF do atendente:");
                    String cpfAtendente = ler.nextLine();
                    System.out.println("Digite o salário base:");
                    double salarioAtendente = ler.nextDouble();
                    ler.nextLine(); // Limpar
                    System.out.println("Digite a data de nascimento:");
                    String dataNascimentoAtendente = ler.nextLine();
                    System.out.println("Digite a comissão:");
                    double comissaoAtendente = ler.nextDouble();
                    ler.nextLine(); // Limpar
                    Atendente atendente = new Atendente(nomeAtendente, cpfAtendente, salarioAtendente, dataNascimentoAtendente, comissaoAtendente);
                    listaFuncionarios.add(atendente);
                    System.out.println("Atendente cadastrado com sucesso!");
                    break; // <-- ADICIONADO AQUI!

                case 3:
                    System.out.println("Lista de Funcionários:");
                    for (Funcionario f : listaFuncionarios) {
                        System.out.println("Nome: " + f.getNome() + ", CPF: " + f.getCpf());
                    }
                    break; // <-- ADICIONADO AQUI!

                case 4:
                    System.out.println("Digite o CPF do funcionario: ");
                    String cpfBusca = ler.nextLine();
                    boolean encontrado = false;
                    for (Funcionario f : listaFuncionarios) {
                        if (f.getCpf().equals(cpfBusca)) {
                            System.out.println("Salário de " + f.getNome() + ": R$" + f.getSalario());
                            encontrado = true;
                            break; // Esse break é para o loop 'for', parando a busca assim que encontrar.
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Funcionario nao encontrado.");
                    }
                    break; // Esse já estava correto no seu código!

                case 5:
                    System.out.println("Saindo...");
                    break; // Esse já estava correto!

                default:
                    System.out.println("!1!1!Essa opção não existe!1!1!");
                    // O default não exige break, pois já é a última opção do switch.
            }
        }
        
        ler.close(); // Movido para o final, FORA do while, para fechar apenas quando o programa terminar.
    }
}
