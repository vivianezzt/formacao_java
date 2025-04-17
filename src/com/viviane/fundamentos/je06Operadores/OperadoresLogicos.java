package com.viviane.fundamentos.je06Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
      boolean condicao1 = true;
      boolean condicao2 = false;

      if(condicao1 && condicao2) {
        System.out.println("As duas condicoes sao verdadeiras");
      }

      if(condicao1 || condicao2) {
        System.out.println("Uma das condicoes e verdadeira");
      }

      if(condicao1 && (7 > 4)) {
        System.out.println("As duas condicoes sao verdadeiras");
      }

      if(condicao1 || (7 > 4)) {
        System.out.println("Uma das condicoes e verdadeira");
      }

      if(condicao1 && (7 > 4) && condicao2) {
        System.out.println("Todas as condicoes sao verdadeiras");
      }
      
     if(1 == 1 && 2 < 3) {
        System.out.println("As duas condicoes sao verdadeiras");
     }

     if(1 == 1 || 2 < 3) {
        System.out.println("Uma das condicoes e verdadeira");
     }
     if((1==1 && 2 > 3 ) || 4 < 5) {
        System.out.println("Uma das condicoes e verdadeira");
     }

     if(1 == 1 && (2 > 3 || 4 < 5)) {
        System.out.println("As duas condicoes sao verdadeiras");
     }
    }
}
