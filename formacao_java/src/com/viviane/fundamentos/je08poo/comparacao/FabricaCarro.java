package com.viviane.fundamentos.je08poo.comparacao;

public class FabricaCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro("Branco", "Ford", "Fusion");
        Carro c2 = new Carro("Branco", "Ford", "Fusion");
        Carro c3 = new Carro("Branco", "Ford", "Fusion");
        Carro c4 = c1;

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));
        
    }
}
