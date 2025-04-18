package com.viviane.fundamentos.je09ClassesEssencias;

public class ClassesEssenciais3 {
    public static void main(String[] args) {
        String nome = "Viviane";
        nome = nome.concat("Aguiar");
        nome = nome.concat("Sou desenvolvedora");

        StringBuilder sb = new StringBuilder();
        sb.append("Viviane");
        sb.append("Aguiar");
        sb.append("Sou desenvolvedora");

        System.out.println(nome);
        System.out.println(sb.toString());
        
        
    }
}
