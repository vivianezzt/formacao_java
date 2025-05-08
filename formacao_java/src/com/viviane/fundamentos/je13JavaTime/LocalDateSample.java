package com.viviane.fundamentos.je13JavaTime;

import java.time.Month;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {
    public static void main(String[] args) {
        int idadeAlvo = 40;
        int anoNascimento = 1984; // ajusta aqui se for outro

        // Ano em que completa 45 anos
        int anoCom45 = anoNascimento + idadeAlvo;

        // Cria a data exata em que você faz 45 anos (ex: 29/04/2029)
        LocalDate aniversario45 = LocalDate.of(anoCom45, 4, 29);

        // Formatação BR (opcional)
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Exibe o resultado
        System.out.println("🎉 Você terá 45 anos em: " + aniversario45.format(formatoBR));
        System.out.println("📅 Ano: " + aniversario45.getYear());

        LocalDate hoje = LocalDate.now();
        LocalTime agora = LocalTime.now();
        LocalDateTime momento = LocalDateTime.now();

        System.out.println(hoje);
        System.out.println(agora);
        System.out.println(momento);

        LocalDate nascimento = LocalDate.of(1990, 5, 10);
        LocalTime horario = LocalTime.of(14, 30, 0);

        System.out.println(nascimento);
        System.out.println(horario);

        LocalDateTime dataHora = LocalDateTime.of(nascimento, horario);
        System.out.println(dataHora);

        LocalDate hoje2 = LocalDate.now();

        LocalDate semanaQueVem = hoje2.plusWeeks(1);
        LocalDate anoPassado = hoje2.minusYears(1);
        LocalDate mais3Dias = hoje2.plusDays(3);

        System.out.println(semanaQueVem);
        System.out.println(anoPassado);
        System.out.println(mais3Dias);

        LocalDate dataEspecifica = LocalDate.of(2025, 4, 29);
        System.out.println(dataEspecifica);

        LocalDate dataEspecifica2 = LocalDate.of(2025, Month.APRIL, 29);
        System.out.println(dataEspecifica2);

        LocalDate data1 = LocalDate.of(2024, 1, 1);
        LocalDate data2 = LocalDate.of(2025, 1, 1);

        boolean isAntes = data1.isBefore(data2); // true
        boolean isDepois = data1.isAfter(data2); // false
        boolean isIgual = data1.equals(data2); // false

        System.out.println(isAntes);
        System.out.println(isDepois);
        System.out.println(isIgual);

        LocalDate inicio = LocalDate.of(2020, 1, 1);
        LocalDate fim = LocalDate.now();

        Period periodo = Period.between(inicio, fim);
        System.out.println("Anos: " + periodo.getYears());
        System.out.println("Meses: " + periodo.getMonths());
        System.out.println("Dias: " + periodo.getDays());

        Duration duracao = Duration.between(LocalTime.of(9, 0), LocalTime.of(12, 30));
        System.out.println("Duração em minutos: " + duracao.toMinutes());

        if (LocalDate.now().isAfter(LocalDate.of(2024, 12, 31))) {
            System.out.println("Já passou de 2024!");
        }

        if (LocalDate.now().isBefore(LocalDate.of(2024, 12, 31))) {
            System.out.println("Ainda não passou de 2024!");
        }

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = LocalDate.now().format(formatador);
        System.out.println(dataFormatada); // Ex: 18/04/2025

        // Parse (texto para data)
        LocalDate dataConvertida = LocalDate.parse("01/01/2024", formatador);
        System.out.println(dataConvertida); // Ex: 2024-01-01

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataFutura = dataAtual.plusDays(30);

        System.out.println("Data atual: " + dataAtual);

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println(zdt);

        ZoneId brasil = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zdt2 = ZonedDateTime.now(brasil);
        System.out.println(zdt2);

    }
}
