package ex007;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        // O usuário deve ser aceito sem diferenciar maiúsculas ( admin, Admin e ADMIN funcionam);

        // A senha deve ser comparada exatamente - senha diferencia maiúscula de minúscula;

        // Ignore espaços sobrando nas pontas dos dois campos;
        // Se falhar, informe o que falhou: usuario inexistente ou senha incorreta.

        // Usuario: ADMIN
        // Senha: unicap2026

        // Acesso liberado. Bem-vindo, ADMIN!
        Scanner sc = new Scanner(System.in);

        String usuario, senha;

        System.out.print("Usuário: ");
        usuario = sc.nextLine();

        System.out.print("Senha: ");
        senha = sc.nextLine();

        sc.close();

        if (usuario.trim().equalsIgnoreCase("admin")) {
            if (senha.trim().equals("unicap2026")) {
                System.out.println("Acesso liberado. Bem-vindo, " + usuario);         
            } else {
                System.out.println("Senha incorreta");
            }   
        }   else {
            System.out.println("Usuario Incorreto");
        }
        
    }   
}
