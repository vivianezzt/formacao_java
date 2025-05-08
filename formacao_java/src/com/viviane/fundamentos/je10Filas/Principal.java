package com.viviane.fundamentos.je10Filas;

import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        
        LinkedList<String> pilha = new LinkedList<>();
        pilha.push("Viviane");
        pilha.push("João");
        pilha.push("Maria");
        pilha.push("Pedro");

        System.out.println("Pessoas na fila: " + pilha);
        while(!pilha.isEmpty()){
            System.out.println("Atendendo: " + pilha.pop());
        }

        pilha.push("Ana");
        pilha.push("Carlos");
        pilha.push("Daniel");

        System.out.println("Pessoas na fila: " + pilha);
        while(!pilha.isEmpty()){
            System.out.println("Atendendo: " + pilha.pop());
        }
    }
}
