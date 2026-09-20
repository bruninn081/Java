package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, P, R, D;

        P = 3.14159;
        

        System.out.println("Entrada");
        R = sc.nextDouble();
        D = Math.pow(R, 2.0);

        A = P * D;
        System.out.println("Saída");
        System.out.printf("%.4f%n", A);


        sc.close();
    }
}
