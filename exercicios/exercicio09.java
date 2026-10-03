package exercicios;

import java.util.Scanner;

public class exercicio09 {
    public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int X, Y;

    System.out.print("Digite um número: ");
    X = sc.nextInt();

    System.out.print("Digite outro número: ");
    Y = sc.nextInt();

    if (X % Y == 0 && Y % X == 0) {
        System.out.println("São Multiplos");
    } 
    else {
        System.out.println("Não são Multiplos");
    }

    sc.close();
    }
}
