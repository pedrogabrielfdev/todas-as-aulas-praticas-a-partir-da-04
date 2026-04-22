import java.util.Scanner;

public class Q3P5 {

    public static boolean elementoExiste(String[] array, String busca) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(busca)) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        String[] nomes = {"a","b","c","d","e"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome para buscar: ");
        String busca = sc.nextLine();

        boolean resultado = elementoExiste(nomes, busca);
        System.out.println("Isso é: " + resultado);
    }
}
