package com.viviane.fundamentos.je11AlgoritmosIterativosRecursivos;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos: ");
        int n = in.nextInt();
        in.close();

        for (int i = 1; i <= n; i++) {
            System.out.println("Fibonacci (" + i + ") = " + fibo(i));
        }
    }

    public static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1, b = 1, soma = 0;
        for (int i = 3; i <= n; i++) {
            soma = a + b;
            a = b;
            b = soma;
        }
        return soma;
    }
}
