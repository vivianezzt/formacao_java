package com.viviane.fundamentos.je07EstruturasDeControle;

// Modo condicional if/else
public class SistemaMedida {
    public static void main(String[] args) {
      String sigla = "M";
  
      if(sigla == "P")
        System.out.println("PEQUENO");
      else if(sigla == "M")
        System.out.println("MÉDIO");
      else if(sigla == "G")
        System.out.println("GRANDE");
      else
        System.out.println("INDEFINIDO");
    }
  }