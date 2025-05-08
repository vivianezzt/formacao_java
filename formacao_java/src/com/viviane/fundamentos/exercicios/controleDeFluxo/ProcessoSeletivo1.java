package com.viviane.fundamentos.exercicios.controleDeFluxo;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo1 {

  public static void main(String[] args) {
      double salarioBase = 2000.0;

      // Exemplo: simular o salário pretendido
      double salarioPretendido = valorPretendido();

      System.out.println("Salário Pretendido: R$ " + salarioPretendido);
// Case 1: salario base maior que salario pretendido
      if (salarioBase > salarioPretendido) {
          System.out.println("LIGAR PARA O CANDIDATO");
      } else if (salarioBase == salarioPretendido) {
          System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
      } else {
          System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
      }
  }
 
  // Método para gerar valor pretendido entre 1800 e 2200
  static double valorPretendido() {
      return Math.round(ThreadLocalRandom.current().nextDouble(1800, 2200) * 100.0) / 100.0;
  }
}
