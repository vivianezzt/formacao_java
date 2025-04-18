package com.viviane.fundamentos.je11AlgoritmosIterativosRecursivos;

import java.util.Scanner;

public class FatorialIterativo {
    public static void main(String[] args) {
     // algoritmo iterativo para calcular o fatorial de um numero
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }
// algoritmo iterativo para calcular o fatorial de um numero
    public static int fatorial(int n){
        int resultado = 1;
        for(int i = 1; i <= n; i++){
            resultado *= i;
        }
        return resultado;
    }

}
