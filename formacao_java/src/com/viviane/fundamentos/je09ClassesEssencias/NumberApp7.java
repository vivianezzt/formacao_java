package com.viviane.fundamentos.je09ClassesEssencias;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberApp7 {
    public static void main(String[] args) {
        BigDecimal precoLitro = BigDecimal.valueOf(5.799);
        BigDecimal listrosUtilizados = BigDecimal.valueOf(21.752);
        BigDecimal valorPagar = listrosUtilizados.multiply(precoLitro);
        System.out.println(valorPagar); //126.139848
       
        //arredondando ...
        BigDecimal valorPagarArredondado = valorPagar.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(valorPagarArredondado); //126.14
        }
}
