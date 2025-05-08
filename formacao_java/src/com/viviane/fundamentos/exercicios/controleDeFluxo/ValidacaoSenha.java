package com.viviane.fundamentos.exercicios.controleDeFluxo;

import java.util.Scanner;

public class ValidacaoSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaDigitada;
        String senhaCorreta = "java123";

        System.out.println("Bem-vindo ao sistema de login!");

        while (true) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Acesso concedido!");
                break; // Sai do loop while quando a senha está correta
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        scanner.close();
    }
}
