package com.viviane.fundamentos.je07EstruturasDeControle;

// Modo condicional switch/case
public class PlanoOperacaoSwitch {
    public static void main(String[] args) {
      String plano = "M"; // M / T
  
      switch (plano) {
        case "T": {
          System.out.println("5Gb Youtube");
        }
        case "M": {
          System.out.println("WhatsApp e Instagram grátis");
        }
        case "B": {
          System.out.println("100 minutos de ligação");
        }
      }
    }
  }
