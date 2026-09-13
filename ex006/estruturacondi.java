package ex006;

import java.util.Scanner;

public class estruturacondi {
    public static void main(String[] args) {
        String nome;
        double n1; 
        double n2;
        double n3;
        double n4;
        double m;

    Scanner sc = new Scanner(System.in);
    System.out.print("Qual o seu nome? ");
        nome = sc.next();
    System.out.println("Seja Bem-vindo, " + nome);
    System.out.println();
    System.out.println("Informe sua primeira nota: ");
        n1 = sc.nextDouble();
    System.out.println("Informe sua segunda nota: ");
        n2 = sc.nextDouble();
    System.out.println("Informe sua terceira nota: ");
        n3 = sc.nextDouble();
    System.out.println("Informe sua quarta nota: ");
        n4 = sc.nextDouble();
        
        m = (n1 + n2 + n3 + n4)/4;

    if (m >= 7) {
        System.out.println("Aprovado com a média " + m);
    } else if (m <= 6) {
        System.out.println("Recupera " + m);
    } else {
        System.out.println("Reprovado com a média " + m);
    } 

    sc.close();   
    }
}
