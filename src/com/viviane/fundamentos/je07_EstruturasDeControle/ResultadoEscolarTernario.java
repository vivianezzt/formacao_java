package com.viviane.fundamentos.je07_EstruturasDeControle;

public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        int nota1 = 6;
        String resultado1 = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }

}