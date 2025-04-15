package com.viviane.fundamentos.exercicios.controleDeFluxo;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {

    public static void main(String[] args) {
        String[] candidatos = {
            "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", 
            "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"
        };

        double salarioBase = 2000.0;
        int candidatosSelecionados = 0;
        int i = 0;

        while (candidatosSelecionados < 5 && i < candidatos.length) {
            String candidato = candidatos[i];
            double salarioPretendido = valorPretendido();

            System.out.println(candidato + " - Pretende: R$ " + salarioPretendido);

            if (salarioPretendido <= salarioBase) {
                System.out.println(candidato + " SELECIONADO PARA ENTREVISTA");
                candidatosSelecionados++;
            }

            i++;
        }
    }

    static double valorPretendido() {
        return Math.round(ThreadLocalRandom.current().nextDouble(1800, 2200) * 100.0) / 100.0;
    }
}
