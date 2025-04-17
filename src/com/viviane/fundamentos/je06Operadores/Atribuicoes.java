package com.viviane.fundamentos.je06Operadores;

public class Atribuicoes {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        String nome = "Viviane";
        String nomeDoMeuCachorro = "Bidu";

        String sobrenome = "Silva";
        String nomeCompleto = nome + " " + sobrenome;

        boolean bol = (1 + 2) > 4;
        System.out.println(bol);
 
        System.out.println("Nome: " + nome);
        System.out.println("Nome do meu cachorro: " + nomeDoMeuCachorro);
        System.out.println("Nome completo: " + nomeCompleto);
        
        
    }
}
