package com.viviane.fundamentos.je09ClassesEssencias;

public class StringApp6 {
    public static void main(String[] args) {
        Integer numero1 = 100;
        Integer numero2 = 100;
        System.out.println(numero1 == numero2);
        System.out.println(numero1.equals(numero2));
        numero1 = 128;
        numero2 = 128;
        // acima de 127, internamente o Java cria um novo objeto do tipo Integer
        // logo estamos agora nos referindo a dois objetos na aplicação.
        System.out.println(numero1 == numero2);
        System.out.println(numero1.equals(numero2));
        System.out.println(numero1.intValue() == numero2.intValue());
    }
}
