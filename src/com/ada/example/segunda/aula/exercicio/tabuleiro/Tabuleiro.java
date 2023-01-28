package com.ada.example.segunda.aula.exercicio.tabuleiro;

public class Tabuleiro {

    private char[][] tabuleiro = {{'1', '2', '3'},
                                    {'4', '5', '6'},
                                    {'7', '8', '9'}};


    public char[][] getTabuleiro() {
        return this.tabuleiro;
    }

    public void showTabuleiro() {

        for (char[] row : getTabuleiro()){
            for (char collumn : row) {
                System.out.print(collumn + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void setTabuleiro(int linha, int coluna, char caractere){
        char[][] newTab = this.tabuleiro.clone();
        newTab[linha][coluna] = caractere;
        this.tabuleiro = newTab;
    }

    public void tabComJogada(int posicao, char character) {

        switch (posicao) {
            case 1:
                setTabuleiro(0,0, character);
                break;
            case 2:
                setTabuleiro(0,1, character);
                break;
            case 3:
                setTabuleiro(0,2, character);
                break;
            case 4:
                setTabuleiro(1,0, character);
                break;
            case 5:
                setTabuleiro(1,1, character);
                break;
            case 6:
                setTabuleiro(1,2, character);
                break;
            case 7:
                setTabuleiro(2,0, character);
                break;
            case 8:
                setTabuleiro(2,1, character);
                break;
            case 9:
                setTabuleiro(2,2, character);
                break;

            default:
                break;
        }
    }

}