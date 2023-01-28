package com.ada.example.segunda.aula.exercicio.tabuleiro;

public class testeTabuleiro {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.showTabuleiro();
        System.out.println();
        //tabuleiro.setTabuleiro(0,0, 'x');
        tabuleiro.tabComJogada(1, 'x');
        tabuleiro.tabComJogada(9, 'x');



    }
}
