package com.viviane.fundamentos.je05_TiposWrapper;

public class TiposWrapper {
    public static void main(String[] args) {
        double numeroDouble = 123.60;
        int numeroInt = (int) numeroDouble; // explicita
        System.out.println(numeroInt);

        double d = 100.0;
        int i = (int) d;
        System.out.println(i);

        Double e = 100.90;
        Integer x = e.intValue();
        System.out.println(i);

        String num = "100";
        int y = Integer.parseInt(num);
        System.out.println(y);

        String num2 = "100.123";

        double z = Double.parseDouble(num2);
        System.out.println(z);

        Integer obj = Integer.valueOf("100");
        int t = obj.intValue();
        System.out.println(t);

        Integer obj2 = Integer.valueOf("102");
        Integer obj3 = Integer.valueOf("101");

        // comparar
        System.out.println(obj2.equals(obj3));
        System.out.println(obj2.compareTo(obj3));
        System.out.println(obj2 > obj3);


    }
}
