package com.viviane.fundamentos.je08poo;

public class Sistema {
    public static void main(String[] args) {
        Cliente viviane = new Cliente();
        viviane.nome = "Viviane";
        System.out.println("Nome do cliente: " + viviane.nome);
        System.out.println("Limite de crédito: " + viviane.limiteCredito);

        viviane.solicitarLimiteCredito(200.0);
        System.out.println("Novo limite de crédito: " + viviane.limiteCredito);

        Cliente rachel = new Cliente();
        rachel.nome = "Rachel";
        System.out.println("Nome do cliente: " + rachel.nome);
        System.out.println("Limite de crédito: " + rachel.limiteCredito);

        rachel.solicitarLimiteCredito(200.0);
        System.out.println("Novo limite de crédito: " + rachel.limiteCredito);

        rachel.comprar(100.0);
        System.out.println("Novo limite de crédito: " + rachel.limiteCredito);
        rachel.comprar(20.0);
        System.out.println("Novo limite de crédito: " + rachel.limiteCredito);
    }
}
