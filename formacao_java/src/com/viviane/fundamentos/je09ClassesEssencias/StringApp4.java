package com.viviane.fundamentos.je09ClassesEssencias;

public class StringApp4 {
    public static void main(String[] args) {
        StringBuilder stringAlteravel = new StringBuilder("gleyson ");
        // acrescentando o conteúdo sampaio
        stringAlteravel.append("sampaio");
        // substituindo o nome gleyson (os 7 digitos) para izabelly
        stringAlteravel.replace(0, 7, "izabelly");
        // removendo o nome sampaio com um spaço no início
        stringAlteravel.delete(8, 16);
        /*
         * inserindo o conteúdo sampaio novamente
         * a diferença entre insert e append é que o insert possibilita informa
         * inclusive no início do conteúdo
         */
        stringAlteravel.insert(8, " sampaio");
        stringAlteravel.insert(0, "Miss ");

        System.out.println(stringAlteravel.toString());
    }
}
