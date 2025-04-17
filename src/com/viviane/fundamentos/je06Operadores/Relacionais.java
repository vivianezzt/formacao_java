package com.viviane.fundamentos.je06Operadores;

public class Relacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if(a > b) {
            System.out.println("a é maior que b");
        } else {
            System.out.println("b é maior que a");
        }

        if(a < b) {
            System.out.println("a é menor que b");
        } else {
            System.out.println("b é menor que a");
        }
        
        if(a == b) {
            System.out.println("a é igual a b");
        } else {
            System.out.println("a é diferente de b");
        }
        
        if(a != b) {
            System.out.println("a é diferente de b");
        } else {
            System.out.println("a é igual a b");
        }
        
        if(a >= b) {
            System.out.println("a é maior ou igual a b");
        } else {
            System.out.println("a é menor que b");
        }
         

        int idadeBia = 13;
        boolean isMaior = idadeBia >= 18;
        if(idadeBia >= 18) {
            System.out.println("Bia é maior de idade");
        } else {
            System.out.println("Bia é menor de idade");
        }
        
    }
}
