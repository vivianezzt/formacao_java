package com.viviane.fundamentos.je11AlgoritmosIterativosRecursivos;

import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    public static int fatorial(int n){
        if(n == 0){
            return 1;
        } else {
            return n * fatorial(n - 1);// chamada recursiva
        }
    }
}
