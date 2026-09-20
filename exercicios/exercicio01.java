package exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, soma;

        System.out.println("Entrada: ");
        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("Saída: ");
        System.out.println("Soma = " + soma);
        
        sc.close();
    }
}