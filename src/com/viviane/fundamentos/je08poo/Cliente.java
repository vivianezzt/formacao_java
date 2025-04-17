package com.viviane.fundamentos.je08poo;

public class Cliente {
    String nome;
    Double limiteCredito = 100.0;

    public void solicitarLimiteCredito(Double valorSolicitado){
        limiteCredito = valorSolicitado;
    }

    public void comprar(Double valorProduto) {
        limiteCredito = limiteCredito - valorProduto;
    }
}
