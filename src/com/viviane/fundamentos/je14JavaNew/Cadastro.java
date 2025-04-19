package com.viviane.fundamentos.je14JavaNew;

import java.time.LocalDate;
import java.util.Objects;

public class Cadastro {

    public enum Sexo {
        M, F
    }

    private String nome;
    private Sexo sexo;
    private Long telefone;
    private LocalDate dataNascimento;
    private Double valorSugerido;
    private boolean cliente;

    // Construtor validado
    public Cadastro(String nome, String sexo, Long telefone, LocalDate dataNascimento, Double valorSugerido, boolean cliente) {
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.telefone = Objects.requireNonNull(telefone, "Telefone não pode ser nulo");
        this.dataNascimento = Objects.requireNonNull(dataNascimento, "Data de nascimento não pode ser nula");
        this.valorSugerido = Objects.requireNonNull(valorSugerido, "Valor sugerido não pode ser nulo");
        this.cliente = cliente;

        // Validação do valor de sexo
        try {
            this.sexo = Sexo.valueOf(sexo.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Sexo inválido: use apenas 'M' ou 'F'");
        }
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo.name();
    }

    public Long getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Double getValorSugerido() {
        return valorSugerido;
    }

    public boolean isCliente() {
        return cliente;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = Sexo.valueOf(sexo.toUpperCase());
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setValorSugerido(Double valorSugerido) {
        this.valorSugerido = valorSugerido;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }

    // toString() para facilitar escrita e leitura de arquivos
    @Override
    public String toString() {
        return nome + ";" + sexo + ";" + telefone + ";" + dataNascimento + ";" + valorSugerido + ";" + cliente;
    }
}
