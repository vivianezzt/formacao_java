package com.viviane.fundamentos.exercicios.controleDeFluxo;

import java.util.Scanner;

public class VerificaPrimo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();
    
            if (numero <= 1) {
                System.out.println(numero + " não é um número primo.");
                scanner.close();
                return;
            }
    
            boolean ehPrimo = true;
    
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break; // Se encontrar um divisor, não precisa continuar verificando
                }
                // O 'continue' aqui seria redundante, pois se a condição do 'if'
                // for verdadeira, o 'break' já interrompe o loop. Se for falsa,
                // a próxima iteração do loop acontece naturalmente.
                // continue;
            }
    
            if (ehPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
    
            scanner.close();
        }
    }