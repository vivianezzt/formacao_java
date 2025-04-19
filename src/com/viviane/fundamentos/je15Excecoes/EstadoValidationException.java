package com.viviane.fundamentos.je15Excecoes;

public class EstadoValidationException extends RuntimeException {
    public EstadoValidationException(String string) {
        super("Estado inválido: ");
    }

    public EstadoValidationException() {
        //TODO Auto-generated constructor stub
    }
}
