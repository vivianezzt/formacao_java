package com.viviane.fundamentos.je15Excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class Excecoes {
    public static void main(String[] args) throws ParseException {
        try {
            Double valor = (double) (100 / 0);
            System.out.println(valor);

        } catch (Exception e) {
            System.out.println("Erro: ");
            e.printStackTrace();

        } finally {
            System.out.println("Fim do programa");
        }
        // Double valor1 = Double.valueOf("a100");
        Double valor1 = (Double) NumberFormat.getInstance().parse("a100");
        System.out.println(valor1);
    }
    
}
