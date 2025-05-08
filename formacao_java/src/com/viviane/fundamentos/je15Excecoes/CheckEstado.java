package com.viviane.fundamentos.je15Excecoes;

public class CheckEstado {
    public static void main(String[] args) {
        try {
            validarEstado("ma");
        } catch (EstadoValidationException e) {
            System.out.println(e.getMessage());

            e.printStackTrace();
            System.out.println("Estado inválido");
        }   
    }
    static void validarEstado(String nomeEstado) throws EstadoValidationException {
        if(!nomeEstado.equalsIgnoreCase("SP")) {
            throw new EstadoValidationException();
        } else {
            System.out.println("Estado válido, Bem vindo a: " + nomeEstado.toUpperCase());
        }
    }

}
