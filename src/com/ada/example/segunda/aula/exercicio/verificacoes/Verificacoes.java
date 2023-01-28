package com.ada.example.segunda.aula.exercicio.verificacoes;

import com.ada.example.segunda.aula.exercicio.jogador.Jogador;

public class Verificacoes {
    private Verificacoes() {
    }

    public static boolean verificaGanhador(char[][] tabuleiro, Jogador jogador1, Jogador jogador2) {

        if (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') {
            jogador1.showWinner();
            return true;
        } else if (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') {
            jogador1.showWinner();
            return true;
        } else if (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') {
            jogador1.showWinner();
            return true;
        } else if (tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') {
            jogador1.showWinner();
            return true;
        } else if (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') {
            jogador1.showWinner();
            return true;
        } else if (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') {
            jogador1.showWinner();
            return true;
        } else if (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') {
            jogador1.showWinner();
            return true;
        } else if (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X') {
            jogador1.showWinner();
            return true;
        }

        if (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') {
            jogador2.showWinner();
            return true;
        } else if (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') {
            jogador2.showWinner();
            return true;
        } else if (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') {
            jogador2.showWinner();
            return true;
        }

        if (tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') {
            jogador2.showWinner();
            return true;
        } else if (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') {
            jogador2.showWinner();
            return true;
        } else if (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') {
            jogador2.showWinner();
            return true;
        }

        if (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') {
            jogador2.showWinner();
            return true;
        } else if (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O') {
            jogador2.showWinner();
            return true;
        }

        return false;
    }
}
