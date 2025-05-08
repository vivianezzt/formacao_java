package com.viviane.fundamentos.je09ClassesEssencias;

//Continuando ...
import java.util.Scanner;

public class SystemApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite sua idade: ");
        Integer idade = scan.nextInt(); // converte o valor inserido para um Intege

        System.out.println("Digite sua idade: ");
        Double peso = scan.nextDouble(); // converte o valor inserido para um Double
        
        System.out.println("Seu nome é : " + nome);
        System.out.println("Sua idade é : " + idade);
        System.out.println("Sua peso é : " + peso);

        scan.close();
        // scan.nextBigDecimal(); scan  .nextBoolean(); -> já sacou o conceito, corre
    }
}
