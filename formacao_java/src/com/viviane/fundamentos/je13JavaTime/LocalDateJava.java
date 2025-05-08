package com.viviane.fundamentos.je13JavaTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateJava {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();

        System.out.println(dataAtual);
        LocalDate dataEspecifica1 = LocalDate.of(2023, 1, 12);

        LocalDate dataEspecifica2 = LocalDate.of(2023, Month.JANUARY, 12);
        // este conteúdo pode ser um argumento de seu programa via console
        // ou toString() de algum componente visual
        String stringData = "2023-01-17";

        LocalDate dataConcreta = LocalDate.parse(stringData);
        String stringDataBr = "17/01/2023";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataConcreta1 = LocalDate.parse(stringDataBr, formatter);
        // Representação de um LocalDate: 2023-03-01
    }
}
