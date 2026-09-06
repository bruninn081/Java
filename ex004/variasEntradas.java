package ex004;

import java.util.Scanner;

public class variasEntradas {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String x; // varios dados de entrada de dados
        int y;
        double z;

        System.out.println("Digite dados: ");

        System.out.print("Seu nome: ");
        x = sc.next();

        System.out.print("Sua idade: ");
        y = sc.nextInt();

        System.out.print("Sua nota: ");
        z = sc.nextDouble();

        System.out.println("Seja bem-vindo " + x);
        System.out.println("Nome: " + x);
        System.out.println("Idade: " + y);
        System.out.println("Nota: " + z);

        sc.close();
    }
}
