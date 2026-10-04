package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int v1, v2;
        double p1, p2, p3, p4, p5;

        v1=sc.nextInt();
        v2=sc.nextInt();

        p1 = 4.00*v2;
        p2 = 4.50*v2;
        p3 = 5.00*v2;
        p4 = 2.00*v2;
        p5 = 1.50*v2;

        if (v1 == 1) {
            System.out.printf("Total: R$ %.2f%n ", p1);
        } 
        else if (v1 == 2) {
            System.out.printf("Total: R$ %.2f%n ", p2);
        }
        else if (v1 == 3) {
            System.out.printf("Total: R$ %.2f%n ", p3);
        } 
        else if (v1 == 4) {
            System.out.printf("Total: R$ %.2f%n ", p4);
        } 
        else if (v1 == 5) {
            System.out.printf("Total: R$ %.2f%n ", p5);
        }
        sc.close();
    }
}

// jeito mais facil
// import java.util.Scanner;

//public class uri1038 {

	//public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);

		//int codigo = sc.nextInt();
		//int quantidade = sc.nextInt();
		
		//double total;
		//if (codigo == 1) {
			//total = quantidade * 4.0;
		//}
		//else if (codigo == 2) {
			//total = quantidade * 4.5;
		//}
		//else if (codigo == 3) {
			//total = quantidade * 5.0;
		//}
		//else if (codigo == 4) {
			//total = quantidade * 2.0;
		//}
		//else {
			//total = quantidade * 1.5;
		//}

		//System.out.printf("Total: R$ %.2f%n", total);
		
		//sc.close();
	//}
//}
