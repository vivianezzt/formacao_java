package com.viviane.fundamentos.je09ClassesEssencias;

public class NumberApp {
    public static void main(String[] args) {

        // considerar NÃO existir probabilidade de zero à esquerda
        Long celular;
        Long codigoBarras;
        /*
         * Literais numéricos por padrão são convertidos para Integer
         * Logo, é necessário acrescentar o sufixo L para determina-lo com Long
         */
        Long numero = 130L;

        Double numeroDecimal = 1234.5678;
        // representação BR -> 1.234,567
        Double numeroDecimal2 = 1234.5678;
        // representação US -> 1,234.567
        Double numeroDecimal3 = 1234.5678;
        // representação US -> 1,234.567
        Double numeroDecimal4 = 1234.5678;

        Integer numeroInteiro = numeroDecimal.intValue();
        // representação US -> 1,234.567
    }
}
