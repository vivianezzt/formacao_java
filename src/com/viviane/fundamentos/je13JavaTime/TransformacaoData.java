package com.viviane.fundamentos.je13JavaTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class TransformacaoData {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.of(2023, 1, 24, 16, 31, 27);

        LocalDate data = dataHora.toLocalDate();
        LocalTime hora = dataHora.toLocalTime();

        System.out.println(data);
        System.out.println(hora);

        LocalDateTime dataHora2 = LocalDateTime.of(data, hora);
        System.out.println(dataHora2);

        LocalDateTime dataHora3 = LocalDateTime.of(2023, 1, 24, 16, 31, 27);

        LocalTime hora3 = dataHora3.toLocalTime();
        LocalDate data3 = dataHora3.toLocalDate();

        System.out.println(hora3);
        System.out.println(data3);

        LocalDateTime dataHora4 = LocalDateTime.of(2023, 1, 24, 16, 31, 27);

        LocalDate data4 = LocalDate.of(2023, 1, 24);

        LocalDateTime dataHora5 = data4.atTime(16, 31, 27); // 2023-01-24T16:31:27

        dataHora = data4.atTime(LocalTime.of(16, 31, 27)); // 2023-01-24T16:31:27

        dataHora = data4.atTime(LocalTime.of(16, 31)); // 2023-01-24T16:31

        dataHora = data4.atStartOfDay(); // 2023-01-24T00:00

        Instant instante = Instant.parse("2023-03-13T15:58:55.794285600Z");

        // Converte instant para LocalDateTime, sem timezone, adicionando zero em offset
        // / UTC+0
        LocalDateTime dataHora6 = LocalDateTime.ofInstant(instante, ZoneOffset.UTC);
        System.out.println(dataHora6);
        // 2023-03-13T15:58:55.794285600

    }
}
