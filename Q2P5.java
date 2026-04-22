public class Q2P5 {
    public static void main(String[] args) {
        int[]  numeros = {1,2,3,4,5,6,7,8,9};
        int maior = numeros[0];
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("o maior é: " + maior);
    }
}
