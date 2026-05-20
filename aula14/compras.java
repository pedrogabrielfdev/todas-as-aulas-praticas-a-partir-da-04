import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação da lista utilizando ArrayList<String>
        ArrayList<String> listaCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== MENU LISTA DE COMPRAS ===");
            System.out.println("1. Adicionar item");
            System.out.println("2. Listar itens");
            System.out.println("3. Remover item");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
      
            if (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número válido de 1 a 4.");
                scanner.next(); 
                continue;
            }
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                   
                    System.out.print("Digite o nome do item a ser adicionado: ");
                    String novoItem = scanner.nextLine();
                    listaCompras.add(novoItem);
                    System.out.println("Item \"" + novoItem + "\" adicionado com sucesso!");
                    break;

                case 2:
                   
                    System.out.println("\n--- Itens na Lista ---");
                    if (listaCompras.isEmpty()) {
                        System.out.println("A sua lista está vazia.");
                    } else {
                        for (int i = 0; i < listaCompras.size(); i++) {
                            System.out.println(i + ". " + listaCompras.get(i));
                        }
                    }
                    break;

                case 3:
                   
                    if (listaCompras.isEmpty()) {
                        System.out.println("A lista está vazia. Não há itens para remover.");
                    } else {
                        System.out.print("Digite o índice do item que deseja remover: ");
                        
                        if (scanner.hasNextInt()) {
                            int indice = scanner.nextInt();
                            scanner.nextLine(); // Consome a quebra de linha
                            
                           
                            if (indice >= 0 && indice < listaCompras.size()) {
                                String removido = listaCompras.remove(indice);
                                System.out.println("Item \"" + removido + "\" removido com sucesso!");
                            } else {
                                System.out.println("Índice inválido! Escolha um número entre 0 e " + (listaCompras.size() - 1));
                            }
                        } else {
                            System.out.println("Índice inválido! Você deve digitar um número inteiro.");
                            scanner.next();
                        }
                    }
                    break;

                case 4:
                   
                    System.out.println("Encerrando o programa de compras. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha uma opção de 1 a 4.");
                    break;
            }
        }
        
        scanner.close();
    }
}