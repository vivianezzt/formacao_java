package com.viviane.fundamentos.je07EstruturasDeControle;

public class CaixaEletronico {
    // estrutura condicional composta
    public static void main(String[] args) {
        double saldo = 80.0;
        double valorSolicitado = 20.0;
        double novoSaldo = saldo - valorSolicitado;
    
        if(valorSolicitado <= saldo)
        saldo = saldo - valorSolicitado;
    
        if(novoSaldo < 0)
        System.out.println("Saldo insuficiente");
        else {
            System.out.println("Saque realizado com sucesso. Novo saldo: " + novoSaldo);
        }
}
}