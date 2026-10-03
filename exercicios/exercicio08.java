package exercicios;

import java.util.Scanner;

public class exercicio08 {
    public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n, r;
    System.out.print("Digite um número: ");
    n = sc.nextInt();

    r = n % 2;
    if (r == 0) { //poderia ter feito a conta dentro da condição do if (n % 2 == 0)
        System.out.println("PAR");
    }
    else {
        System.out.println("IMPAR");
    }
    sc.close();
    }
}
