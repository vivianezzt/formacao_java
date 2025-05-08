package com.viviane.fundamentos.exercicios.controleDeFluxo;

import java.util.Scanner;

public class ClassificaIdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();

        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        scan.close();
    }
}
