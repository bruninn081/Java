package exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

    int horaInicial = sc.nextInt();
    int horaFinal = sc.nextInt();

    int duracao; //treinar mais a logica e interpretação de questões /falhei nessa questão
    if (horaInicial < horaFinal) {
        duracao = horaFinal - horaInicial;
    }
    else {
        duracao = 24 - horaInicial + horaFinal;
    }

    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    sc.close();
    }
}
