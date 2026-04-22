import java.util.Scanner;
public class Q1P5 {

    public static double hipotenusa (double a,double b){
        return Math.sqrt(a*a + b*b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do cateto x: ");
        Double a = sc.nextDouble();
    
        System.out.println("Digite o valor do cateto y:");
        Double b = sc.nextDouble();

        double hipo = hipotenusa (a,b);

        System.out.print("A hipotenusa é:" + hipo);
    }
}



