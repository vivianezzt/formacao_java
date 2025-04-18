package com.viviane.fundamentos.je11AlgoritmosIterativosRecursivos;

public class BubbleSortCrescente {
    public static void bubbleSortCrescente(int lista[]) {
        int tmp;
        for(int i = 0; i < lista.length - 1; i++){
            for(int j = 0; j < lista.length - 1; j++){
                if(lista[j] > lista[j + 1]){
                    tmp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = tmp;
                }
            }
        }
    }
}