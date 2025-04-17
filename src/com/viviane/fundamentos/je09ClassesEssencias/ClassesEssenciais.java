package com.viviane.fundamentos.je09ClassesEssencias;

public class ClassesEssenciais {
    public static void main(String[] args) {
        System.out.println("Viviane");
        System.out.println("Aguiar");

        System.err.println("Erro");

        try {
            System.out.println("Dividindo 1/0");
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println("Erro ao dividir por zero");
        }
    }
}
