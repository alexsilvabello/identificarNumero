import java.util.Scanner;

public class identificarNumero {
    public static void main(String[] args) {
        int base = 100;
        String maior = "maior";
        String menor = "menor";
        String igual = "igual";
        String par = "par";
        String impar = "impar";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um numero: ");
            int x = sc.nextInt();
            System.out.println("você digitou: " + x);
            if (x > base) {
                System.out.println("Este número é " + maior + " que " + base);
            } else if (x < base) {
                System.out.println("Este número é " + menor + " que " + base);
            } else  {
                System.out.println("Este número é " + igual + " a " + base);
            }
            if (x % 2 == 0) {
                System.out.println("Este número é " + par);
            } else {
                System.out.println("Este número é " + impar);
            }           
        }
    
    }
}