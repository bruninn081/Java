package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        int pec1, pec2, quant1, quant2;
        double valor1, valor2, total;

        pec1 = sc.nextInt();
        quant1 = sc.nextInt();
        valor1 = sc.nextDouble();

        pec2 = sc.nextInt();
        quant2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = valor1 * quant1 + valor2 * quant2;

        System.out.printf("VALOR A PAGAR: %.2f%n", total);

        sc.close();
    }
}
