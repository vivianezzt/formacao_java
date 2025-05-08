package com.viviane.fundamentos.je06Operadores;

public class Unarios {
    public static void main(String[] args) {
        int numero = +5;
        numero = -numero;
        System.out.println(+numero);
        System.out.println(-numero);
        System.out.println(numero * -1);

        int numero1 = +3;
        numero1 = numero1++;
        System.out.println(numero1);

        int numero2 = 3;
        numero2 = numero2--;
        System.out.println(numero2);

        boolean verdadeiro = true;
        boolean falso = false;

        boolean resultado = !verdadeiro;
        boolean falsa = !verdadeiro;
        System.out.println(resultado);
        System.out.println(falsa);
        System.out.println(!falso);
        System.out.println(!verdadeiro);

        if (verdadeiro) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }

        if (falso) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }

    }
}