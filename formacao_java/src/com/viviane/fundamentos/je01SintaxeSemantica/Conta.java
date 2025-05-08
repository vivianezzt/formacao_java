package com.viviane.fundamentos.je01SintaxeSemantica;

public class Conta {
    // variável da classe conta
    double saldo = 10.0;
  
    public void sacar(Double valor) {
      // variável do método
      double novoSaldo = saldo - valor;
    }
  
    public void imprimirSaldo(){
      // disponível em toda classe
      System.out.println(saldo);
      // somente o método sacar conhece esta variável
      // novoSaldo não está acessível aqui pois é local ao método sacar
    }
    
  }
