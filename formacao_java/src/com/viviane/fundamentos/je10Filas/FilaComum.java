package com.viviane.fundamentos.je10Filas;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaComum {
    public static void main(String[] args) {
        Queue<String> filaComum = new LinkedList<>();

        filaComum.add("Viviane");
        filaComum.add("João");
        filaComum.add("Maria");
        filaComum.add("Pedro");

        System.out.println("Pessoas na fila: " + filaComum);
        while(!filaComum.isEmpty()){
            System.out.println("Atendendo: " + filaComum.poll());
        }
        // Fila de prioridade
        PriorityQueue<Pessoa> filaPrioridade = new PriorityQueue<>();

        filaPrioridade.add(new Pessoa("Viviane", true));
        filaPrioridade.add(new Pessoa("João", false));
        filaPrioridade.add(new Pessoa("Maria", false));
        filaPrioridade.add(new Pessoa("Ana", true));
        filaPrioridade.add(new Pessoa("Pedro", false));
        filaPrioridade.add(new Pessoa("Carlos", true));
        filaPrioridade.add(new Pessoa("Daniel", false));
        
        System.out.println("\nFila de prioridade: " + filaPrioridade);
        while(!filaPrioridade.isEmpty()){
            System.out.println("Atendendo: " + filaPrioridade.poll());
        }
    }

}
