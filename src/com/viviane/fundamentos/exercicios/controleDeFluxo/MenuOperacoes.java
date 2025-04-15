package com.viviane.fundamentos.exercicios.controleDeFluxo;

import java.util.Scanner;

public class MenuOperacoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double num1, num2, resultado;

        do {
            System.out.println("[1] Somar");
            System.out.println("[2] Subtrair");
            System.out.println("[3] Multiplicar");
            System.out.println("[4] Dividir");
            System.out.println("[0] Sair");
            System.out.print("Escolha uma operação: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();

                switch (opcao) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado da Soma: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado da Subtração: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado da Multiplicação: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado da Divisão: " + resultado);
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitida!");
                        }
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

            System.out.println(); // Adiciona uma linha em branco para melhor visualização
        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}