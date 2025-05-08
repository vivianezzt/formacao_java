package com.viviane.fundamentos.je13JavaTime;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class InstantJava {
    public static void main(String[] args) {
        // 1970-01-01T00:00:00Z até 2023-03-13T13:18:00Z
        long milisegundos = 1678713480000l;
        Instant instant = Instant.ofEpochMilli(milisegundos);
        System.out.println(instant);

        long segundos = milisegundos / 1000;
        instant = Instant.ofEpochSecond(segundos);
        System.out.println(instant);

        Instant instant2 = Instant.parse("1984-08-13T10:15:30.345Z");

        System.out.println("Instant             : " + instant2);

        // Adding/subtracting seconds
        System.out.println("15 seconds before   : " + instant2.minusSeconds(15));
        System.out.println("10 seconds after    : " + instant2.plusSeconds(10));

        // Adding/subtracting millis
        System.out.println("Minus 45000 millis  : " + instant.minusMillis(45000));
        System.out.println("Plus 10000 millis   : " + instant.plusMillis(10000));

        // Adding/subtracting nanos
        System.out.println("Minus 45123456 nanos: " + instant.minusNanos(45123456));
        System.out.println("Plus 111234567 nanos: " + instant.plusNanos(111234567));

        // Using MINUTES
        System.out.println("45 minutes before   : " + instant.minus(45, ChronoUnit.MINUTES));
        // Using HOURS
        System.out.println("3 hours before      : " + instant.minus(3, ChronoUnit.HOURS));
        // Using MILLIS also supported
        System.out.println("30000 millis later  : " + instant.plus(30000, ChronoUnit.MILLIS));
        // Using DAYS
        System.out.println("10 days later       : " + instant.plus(10, ChronoUnit.DAYS));

        // Using TemporalAmount - Duration
        System.out.println("10 seconds before   : " + instant.minus(Duration.ofSeconds(10)));
        // Using TemporalAmount - Period
        System.out.println("5 days later        : " + instant.plus(Period.ofDays(5)));

        Instant instant1 = Instant.parse("1984-08-13T10:15:30.345Z");
        Instant instant3 = Instant.now();

        System.out.println(instant1.isAfter(instant3)); // false
        System.out.println(instant1.equals(instant3)); // false

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy").withZone(ZoneId.systemDefault());

        Instant instant4 = Instant.parse("2022-02-15T18:35:24.00Z");
        String formattedInstant = formatter.format(instant4);

        System.out.println(formattedInstant); // 15.02.2022

        Instant instant5 = Instant.now();
        System.out.println("Instant    : " + instant5);

        long epochSecond = instant5.getEpochSecond();
        System.out.println("EpochSecond: " + epochSecond);

        int nano = instant5.getNano();
        System.out.println("Nano       : " + nano);
    }
}
