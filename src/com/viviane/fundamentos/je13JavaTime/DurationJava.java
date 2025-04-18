package com.viviane.fundamentos.je13JavaTime;

import java.time.Duration;
import java.time.LocalTime;

public class DurationJava {
    public static void main(String[] args) {
        LocalTime inicíoTreino = LocalTime.of(6, 30, 33);
        LocalTime fimTreino = LocalTime.of(7, 16, 14);

        Duration duration = Duration.between(inicíoTreino, fimTreino);

        System.out.println(duration.getSeconds()); // 2741 segundos

        // convertendo para um LocalTime com base na duração
        LocalTime tempoAtividade = LocalTime.ofSecondOfDay(duration.getSeconds());
        System.out.println(tempoAtividade); // 00:45:41
    }
}
