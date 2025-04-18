package com.viviane.fundamentos.je13JavaTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodJava {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.of(2023, 2, 20);
        LocalDate natal = LocalDate.of(2023, 12, 25);

        Period period = Period.between(hoje, natal);

        System.out.println(period.getYears()); // anos
        System.out.println(period.getMonths()); // meses
        System.out.println(period.getDays()); // dias
    }
}
