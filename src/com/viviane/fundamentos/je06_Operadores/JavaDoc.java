package com.viviane.fundamentos.je06_Operadores;

/**
 * @author Viviane
 * @version 1.0
 * @since 2025
 */
public class JavaDoc {
    public static void main(String[] args) {
        int idade = 15;
        if (idade >= 18) {
            System.out.println("Voce e maior de idade");
        } else {
            System.out.println("Voce e menor de idade");
        }
    }

    /**
     * @param idade
     * @return idade calculada
     */
    public static int calcularIdade(int idade) {
        return idade;
    }
}