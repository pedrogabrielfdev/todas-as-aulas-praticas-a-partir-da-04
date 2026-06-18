import java.util.Scanner;

public class FazerLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaLogin sistema = new SistemaLogin();

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

       
        try {
            sistema.fazerLogin(usuario, senha);
        } catch (LoginInvalidoException e) {
            System.out.println("Acesso Negado: Credenciais incorretas");
        } finally {
            scanner.close();
        }
    }
}