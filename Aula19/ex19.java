import java.util.InputMismatchException;
import java.util.Scanner ;
public class ex19{
public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    int num1;
    int num2;
    int dividir;
    boolean ripita = true;

    while (ripita) {

    try { 
        System.out.println("======Bem vindo a calculadora======\n");
        System.out.println("Digite o primeiro numero: ");
        num1 = ler.nextInt();
        System.err.println("\nDigite o segundo numero: ");
        num2 = ler.nextInt();
        dividir = num1 / num2;
        System.out.println("o numero dividido é: "+dividir);
        ripita = false;


        
    } catch (InputMismatchException e) {
        System.out.println("digitou errado...");
        e.printStackTrace();
        ler.next();
        System.out.println("Tente novamente!");
        

    }
        catch (Exception e) {
            System.out.println("digitou zero...");
            e.printStackTrace();
            System.out.println("Tente novamente!");
        
            
        }
    }
ler.close();
}
}