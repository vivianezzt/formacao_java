package com.viviane.fundamentos.je10Filas;

public class Pessoa implements Comparable<Pessoa>{

    String nome;
    boolean temPrioridade;

    public Pessoa(String nome, boolean temPrioridade){
        this.nome = nome;
        this.temPrioridade = temPrioridade;
    }

    public int compareTo(Pessoa outraPessoa){
        if(this.temPrioridade && !outraPessoa.temPrioridade){
            return -1;
        }
        if(!this.temPrioridade && outraPessoa.temPrioridade){
            return 1;
        }
        return 0;
    }
    
}
