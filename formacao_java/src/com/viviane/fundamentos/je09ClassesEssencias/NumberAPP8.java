package com.viviane.fundamentos.je09ClassesEssencias;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberAPP8 {
    public static void main(String[] args) {
        BigDecimal numero = BigDecimal.valueOf(1.5456);
       
        for(RoundingMode mode: RoundingMode.values()){
        if(mode == RoundingMode.UNNECESSARY)
        continue;
       
        System.out.println("Mode:" + mode.name() + " = " + numero.setScale(2, mode));
        }
        BigDecimal procoLitro = BigDecimal.valueOf(5.799);
        BigDecimal listrosUtilizados = BigDecimal.valueOf(21.752);
        BigDecimal valorPagar = listrosUtilizados.multiply(procoLitro);
        System.out.println(valorPagar);

        // arredondamento
        BigDecimal valorPagarArredondado = valorPagar.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(valorPagarArredondado);
}
}