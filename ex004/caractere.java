package ex004;

import java.util.Scanner;

public class caractere {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char x;

        x = sc.next().charAt(0); // Para inserir apenas 1 caracterece (letra)
        System.out.println("Você digitou: " + x);

        sc.close();
    }
}
