package com.viviane.fundamentos.je13JavaTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeJava {
    public static void main(String[] args) {

        LocalTime horaAtual = LocalTime.now();

        LocalTime horaMinutoSegundoEspecifico = LocalTime.of(13, 21, 42); // 13:21:42

        LocalTime horaMinutoEspecifico = LocalTime.of(13, 21); // 13:21

        LocalTime horaDeUmaString = LocalTime.parse("13:21:42");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime horaDeUmaStringDespadronizada = LocalTime.parse("132142", formatter); // 13:21:42

        System.out.println(horaAtual);
        System.out.println(horaMinutoSegundoEspecifico);
        System.out.println(horaMinutoEspecifico);
        System.out.println(horaDeUmaString);
        System.out.println(horaDeUmaStringDespadronizada);

        LocalTime horaAtual2 = LocalTime.now();
        LocalTime horaAtualMais30Minutos = horaAtual2.plusMinutes(30);
        LocalTime horaAtualMenos2Horas = horaAtual2.minusHours(2);

        System.out.println(horaAtual);
        System.out.println(horaAtualMais30Minutos);
        System.out.println(horaAtualMenos2Horas);
        LocalTime horaAtual3 = LocalTime.now();
        LocalTime horaAtualMenos2Horas2 = horaAtual3.minusHours(2);

        boolean passado = horaAtual3.isBefore(horaAtualMenos2Horas2);

        System.out.println(passado);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HHmmss");

        String horaFormatada = horaAtual.format(formatter2);
        System.out.println(horaFormatada);
        LocalTime hora = LocalTime.of(13, 21, 42);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("ss-mm-HH");
        String horaFormatada2 = hora.format(formatter3);
        System.out.println(horaFormatada2); // 42-21-13

        LocalTime horah = LocalTime.of(13, 21, 42);

        System.out.println(horah.getHour()); // 13
        System.out.println(horah.getMinute()); // 21
        System.out.println(horah.getSecond()); // 42
        System.out.println(horah.getNano()); // 0

        

    }
}
