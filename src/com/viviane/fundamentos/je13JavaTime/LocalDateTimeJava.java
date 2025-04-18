package com.viviane.fundamentos.je13JavaTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeJava {
    public static void main(String[] args) {
        // 2023-06-25T16:25 -> data e hora sem segundo
        LocalDateTime dataHora = LocalDateTime.of(2023, 6, 25, 16, 25);

        // 2023-06-25T16:25:33 -> data e hora com segundo
        dataHora = LocalDateTime.of(2023, 6, 25, 16, 25, 33);

        LocalDateTime dataHora2 = LocalDateTime.of(2023, 6, 25, 16, 25);

        LocalDateTime proximoMes = dataHora2.plusMonths(1);

        LocalDateTime dataHoraComMenos15Minutos = dataHora2.minusMinutes(15);

        LocalDateTime dataHoraDefinindoSegundoZero = dataHora2.withSecond(33);

        System.out.println(dataHora);
        System.out.println(dataHora2);
        System.out.println(proximoMes);
        System.out.println(dataHoraComMenos15Minutos);
        System.out.println(dataHoraDefinindoSegundoZero);

        LocalDateTime dataHora1 = LocalDateTime.of(2023, 6, 25, 16, 25);
        LocalDateTime dataHora3 = LocalDateTime.of(2023, 6, 25, 16, 25, 17);

        // comparando dois objetos data/hora em sua totalidade
        boolean dataHoraIgual = dataHora1.equals(dataHora3); // false

        // comparando dígito específico de uma data e hora
        boolean dataHoraDigitoIgual = dataHora1.getDayOfMonth() == dataHora3.getDayOfMonth(); // true

        System.out.println(dataHoraIgual);
        System.out.println(dataHoraDigitoIgual);

        LocalDateTime dataHora4 = LocalDateTime.of(2023, 6, 25, 16, 25);
        LocalDateTime dataHora5 = LocalDateTime.of(2023, 6, 25, 16, 25, 17);

        LocalDateTime dataHora6 = LocalDateTime.of(2023, 7, 22, 17, 33);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String dataHoraFormatada = dataHora6.format(formatter);
        System.out.println(dataHoraFormatada); // 22/07/23 17:33:00

    }
}
