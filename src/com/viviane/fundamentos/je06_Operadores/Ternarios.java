package com.viviane.fundamentos.je06_Operadores;

public class Ternarios {
    public static void main(String[] args) {
        String nome = "Viviane";
        int idade = 40;
        final int MAIOR_IDADE = 18;
        String resultado = idade >= MAIOR_IDADE ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);

        String resultado2 = idade >= MAIOR_IDADE ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado2);
        
        String nome1 = "Bia";
        int idade1 = 15;
        final int MAIOR_IDADE1 = 18;
        String resultado1 = idade1 >= MAIOR_IDADE1 ? "Bia e maior de idade " + nome1 : "Bia e menor de idade " + nome1;
    }
}
