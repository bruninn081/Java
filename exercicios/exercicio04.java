package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, h;
        double ht, sal;

        System.out.println("Entrada");
        n = sc.nextInt();
        h = sc.nextInt();
        ht = sc.nextDouble();

        sal = h * ht;

        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f%n ", sal);

        sc.close();
    }
}
