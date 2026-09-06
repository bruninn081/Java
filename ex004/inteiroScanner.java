package ex004;

import java.util.Scanner;

public class inteiroScanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um numero: ");
        int x;
        x = sc.nextInt(); // Para inserir números inteiros
        System.out.println("O numero digitado foi: " + x);

        sc.close();
    }
}
