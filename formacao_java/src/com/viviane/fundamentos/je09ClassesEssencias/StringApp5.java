package com.viviane.fundamentos.je09ClassesEssencias;

import java.time.LocalDateTime;

public class StringApp5 {
    public static void main(String[] args) {

        StringBuffer builder = new StringBuffer();
        int start = LocalDateTime.now().getNano();
        for (int caractere = 1; caractere <= 1000000; caractere++) {
            builder.append("\n");
        }
        // System.out.println(builder.toString());
        System.out.println("Nano:" + (LocalDateTime.now().getNano() - start));

    }
}
