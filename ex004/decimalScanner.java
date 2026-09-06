package ex004;

import java.util.Locale;
import java.util.Scanner;

public class decimalScanner {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite numero decimal: ");
        double x;
        x= sc.nextDouble(); // Para inserir números decimais 
        System.out.println("Voce digitou: " + x);

        sc.close();
    } 
}     
