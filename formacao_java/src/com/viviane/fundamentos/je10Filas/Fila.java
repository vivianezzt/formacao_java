package com.viviane.fundamentos.je10Filas;

import java.util.LinkedList;

public class Fila {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        fila.add("Viviane");
        fila.add("João");
        fila.add("Maria");
        fila.add("Pedro");
        fila.add("Ana");
        fila.add("Carlos");
        fila.add("Daniel");

        int tam = fila.size();
        for(int i = 0; i < tam; i++){
            System.out.println(fila.getFirst());
            fila.removeFirst();
        }
        System.out.println("Fila vazia");
    }

}
