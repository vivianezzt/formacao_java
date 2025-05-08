package com.viviane.fundamentos.je11AlgoritmosIterativosRecursivos;

public class FatorialIterativo2 {
    public static int main(String[] args) {
        int n = 0;
        int res = n;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
