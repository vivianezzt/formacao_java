package com.viviane.fundamentos.exercicios.controleDeFluxo;

public class LabirintoSolver {

    private static final int LINHAS = 5;
    private static final int COLUNAS = 5;
    private static final char CAMINHO = '.';
    private static final char PAREDE = '#';
    private static final char VISITADO = 'x';
    private static final char SAIDA = 'S';

    public static void main(String[] args) {
        char[][] labirinto = {
            {'.', '#', '.', '.', '.'},
            {'.', '#', '.', '#', '.'},
            {'.', '.', '.', '#', '.'},
            {'#', '#', '.', '.', '.'},
            {'.', '.', '.', '#', 'S'}
        };

        System.out.println("Labirinto inicial:");
        imprimirLabirinto(labirinto);

        boolean encontrou = resolverLabirinto(labirinto, 0, 0);
        if (encontrou) {
            System.out.println("\n🎉 Caminho encontrado!");
        } else {
            System.out.println("\n🚫 Nenhum caminho até a saída.");
        }

        imprimirLabirinto(labirinto);
    }

    public static boolean resolverLabirinto(char[][] labirinto, int linha, int coluna) {
        if (!posicaoValida(labirinto, linha, coluna)) return false;

        if (labirinto[linha][coluna] == SAIDA) return true;

        labirinto[linha][coluna] = VISITADO;

        // Tentar mover para todas as direções (cima, baixo, esquerda, direita)
        if (resolverLabirinto(labirinto, linha - 1, coluna) ||  // cima
            resolverLabirinto(labirinto, linha + 1, coluna) ||  // baixo
            resolverLabirinto(labirinto, linha, coluna - 1) ||  // esquerda
            resolverLabirinto(labirinto, linha, coluna + 1))    // direita
        {
            return true;
        }

        // backtrack
        labirinto[linha][coluna] = CAMINHO;
        return false;
    }

    public static boolean posicaoValida(char[][] labirinto, int linha, int coluna) {
        return linha >= 0 && linha < LINHAS &&
               coluna >= 0 && coluna < COLUNAS &&
               (labirinto[linha][coluna] == CAMINHO || labirinto[linha][coluna] == SAIDA);
    }

    public static void imprimirLabirinto(char[][] labirinto) {
        for (char[] linha : labirinto) {
            for (char c : linha) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

