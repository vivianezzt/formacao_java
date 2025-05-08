package com.viviane.fundamentos.je09ClassesEssencias;

public class StringApp3 {
    public static void main(String[] args) {
        String str = "abc";

        // é equivalente a:
        char data[] = { 'a', 'b', 'c' };
        String str1 = new String(data);

        // aqui mais alguns recursos oferecidos pela classe String
        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2, 3);
        String d = cde.substring(1, 2);

        String password = "Sup3rP@ss!$%*&";

        String nome = "Viviane";
        nome.toLowerCase();
        // converte para minusculo
        nome.toUpperCase();
        // converte para maiusculo
        nome.trim();
        // remove espaços em branco
        nome.replace("V", "B");
        // substitui o primeiro parametro pelo segundo
        nome.substring(0, 3);
        // retorna a substring a partir do indice 0 e pega 3 caracteres
        nome.length();
        // retorna o numero de caracteres da string
        nome.indexOf("i");
        // retorna o indice da primeira ocorrencia do parametro 
        nome.lastIndexOf("i");
        // retorna o indice da ultima ocorrencia do parametro
        nome.equals("Viviane");
        // verifica se a string é igual ao parametro
        nome.equalsIgnoreCase("viviane");
        // verifica se a string é igual ao parametro ignorando o caso
        nome.split(" ");
        // divide a string em um array de strings a partir do parametro
        nome.join(" ", "Viviane", "Aguiar", "Sou desenvolvedora");
        // junta as strings em uma unica string a partir do parametro
        nome.contains("ian");
        // verifica se a string contem o parametro
        
    }
}
