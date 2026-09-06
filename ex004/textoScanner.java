package ex004;

import java.util.Scanner;

public class textoScanner {
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    
    System.out.print("Digite uma palavra: ");
    String x;
    x = sc.next(); // Para inserir texto
    System.out.println("Voce digitou: " + x);

    sc.close();
    }

}
 