package com.viviane.fundamentos.je09ClassesEssencias;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberApp6 {
    public static void main(String[] args) {

        BigDecimal um = BigDecimal.ONE;
        BigDecimal dez = BigDecimal.TEN;
        BigDecimal resultado = dez.add(um); // 9
        BigDecimal calculoComplexo = dez.subtract(um).divide(new BigDecimal(3));
        System.out.println(calculoComplexo); // ???
        /*
         * add -> somar
         * subtract -> subtrair
         * multiply -> multiplicar
         * divide -> dividir
         */
        BigDecimal resultado1 = BigDecimal.TEN.divide(BigDecimal.valueOf(3));
        // Exceção: Non-terminating decimal expansion; no exact representable
        // decimal result.
        BigDecimal divisor = BigDecimal.valueOf(3);
        BigDecimal resultado2 = BigDecimal.TEN.divide(divisor, 3, RoundingMode.HALF_EVEN);
        System.out.println(resultado);

    }
}
