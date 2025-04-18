package com.viviane.fundamentos.je11AlgoritmosIterativosRecursivos;

public class FibonacciRecursivo {
    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    } 
    public static int fibo(int n1){
        if(n1 != 1 && n1 != 2)
        return fibo(n1 - 1) + fibo(n1 - 2);
        else
        return 1;
    }

}
