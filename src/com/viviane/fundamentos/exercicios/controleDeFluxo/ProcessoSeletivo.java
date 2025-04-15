package com.viviane.fundamentos.exercicios.controleDeFluxo;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
      case2();
    }
  
    static void case2() {
      double salarioBase = 2000.0;
      String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
      int totalSelecionados = 0;
      int proximoCandidato = 0;
  
      while (totalSelecionados < 5 && proximoCandidato < candidatos.length) {
        String candidato = candidatos[proximoCandidato];
        double salarioPretendido = valorPretendido();
    
        System.out.printf("%s - Pretensão salarial: R$ %.2f%n", candidato, salarioPretendido);
    
        if (salarioPretendido <= salarioBase) {
            System.out.println(candidato + " SELECIONADO PARA ENTREVISTA");
            totalSelecionados++;
        } else {
            System.out.println(candidato + " NÃO FOI SELECIONADO");
        }
    
        proximoCandidato++;
    }
    
     
  
      System.out.println("Total de selecionados: " + totalSelecionados);
      System.out.println("Total de consultados: " + proximoCandidato);
    }
    static double valorPretendido() {
      return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
  }
