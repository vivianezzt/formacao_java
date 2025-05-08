package com.viviane.fundamentos.je08poo.comparacao;

public class ComparacaoApp {
    public static void main(String[] args) {

        String nome1 = "JAVA";
        String nome2 = "JAVA";
      
        System.out.println(nome1 == nome2); //true
      
        String nome3 = new String("JAVA");
      
        System.out.println(nome1 == nome3); //false
      
        String nome4 = nome3;
      
        System.out.println(nome3 == nome4); //true
      
        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??
        // stack (ate 127) vs heap (acima de 127) 
       String nome = "Viviane";
       String nomeCopy = new String("Viviane");

       System.out.println(nome == nomeCopy);
       
    }
}
