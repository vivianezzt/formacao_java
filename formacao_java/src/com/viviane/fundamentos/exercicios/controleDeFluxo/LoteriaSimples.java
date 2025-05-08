package com.viviane.fundamentos.exercicios.controleDeFluxo;

import java.util.Random;
import java.util.Scanner;

public class LoteriaSimples {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroSorteado = random.nextInt(10) + 1; // Gera número aleatório entre 1 e 10
        int tentativasRestantes = 3;
        int palpite;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo da Loteria!");
        System.out.println("Tente adivinhar o número sorteado entre 1 e 10.");
        System.out.println("Você tem 3 tentativas.");

        while (tentativasRestantes > 0) {
            System.out.print("Tentativa " + (4 - tentativasRestantes) + ": Digite seu palpite: ");
            palpite = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

            if (palpite == numeroSorteado) {
                System.out.println("Parabéns! Você acertou o número!");
                acertou = true;
                break; // Sai do loop se o jogador acertar
            } else {
                tentativasRestantes--;
                System.out.println("Você errou! Tente novamente.");
                if (palpite < numeroSorteado) {
                    System.out.println("Dica: O número sorteado é maior.");
                } else {
                    System.out.println("Dica: O número sorteado é menor.");
                }
            }
        }

        if (!acertou) {
            System.out.println("\nSuas tentativas acabaram.");
            System.out.println("O número sorteado era: " + numeroSorteado);
        }

        scanner.close();
    }
}