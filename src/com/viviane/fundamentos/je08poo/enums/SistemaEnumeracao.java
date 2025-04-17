package com.viviane.fundamentos.je08poo.enums;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        EstadosBrasileiros estado = EstadosBrasileiros.valueOf("PI");
        System.out.println("Nome do estado: " + estado.getNome());
        System.out.println("Sigla do estado: " + estado.getSigla());
        System.out.println(estado.getNome());
        System.out.println(estado.getSigla());
    }
    
}
