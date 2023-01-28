package com.ada.example.segunda.aula.exercicio;

import com.ada.example.segunda.aula.exercicio.jogador.Jogador;
import com.ada.example.segunda.aula.exercicio.tabuleiro.Tabuleiro;
import com.ada.example.segunda.aula.exercicio.verificacoes.Verificacoes;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String reiniciar = "";
        boolean verificar = false;
        Tabuleiro tabuleiro = new Tabuleiro();
        do {
            try {
                Inicialize();

                System.out.println("Informe o nome do JOGADOR1:");
                Jogador jogador1 = new Jogador(sc.next(), 'X');
                System.out.println("Informe o nome do JOGADOR2:");
                Jogador jogador2 = new Jogador(sc.next(), 'O');

                tabuleiro.showTabuleiro();

                int posicao = 0;
                int n = 1;
                char character;
                String vezDeQuem;
                if(n >= 4){
                    verificar = Verificacoes.verificaGanhador(tabuleiro.getTabuleiro(), jogador1, jogador2);
                }

                while ((n <= 9) && verificar == false) {

                    if (n % 2 == 0) {
                        vezDeQuem = jogador1.getNome();
                        character = jogador1.getCaractere();
                    } else {
                        vezDeQuem = jogador2.getNome();
                        character = jogador2.getCaractere();
                    }

                    if (n > 8 && verificar == false) {
                        System.out.println("A partida terminou em empate!");
                        System.out.println("AHHHH O JOGO DEU VELHA! EMPATE!!!!");
                        break;
                    }

                    n++;
                    System.out.printf("MOVIMENTO %d: %s ESCOLHA UM NÚMERO correspondente a sua jogada:", n, vezDeQuem);
                    posicao = sc.nextInt();

                    if(vezDeQuem.equals(jogador1.getNome())) {
                        tabuleiro.tabComJogada(posicao, jogador1.getCaractere());
                        tabuleiro.showTabuleiro();
                        verificar = Verificacoes.verificaGanhador(tabuleiro.getTabuleiro(), jogador1, jogador2);
                    }
                    else {
                        tabuleiro.tabComJogada(posicao, jogador2.getCaractere());
                        tabuleiro.showTabuleiro();
                        verificar = Verificacoes.verificaGanhador(tabuleiro.getTabuleiro(), jogador1, jogador2);
                    }

                    if (n > 8 && verificar == false) {
                        System.out.println("A partida terminou em empate!");
                        System.out.println("AHHHH O JOGO DEU VELHA! EMPATE!!!!");
                        break;
                    }

                    while (posicao < 1 || posicao > 9) {
                        System.out.println("Você não escreveu um numero, escreva um número no tabuleiro:");
                        posicao = sc.nextInt();
                        if(vezDeQuem.equals(jogador1.getNome())) {
                            tabuleiro.tabComJogada(posicao, jogador1.getCaractere());
                            tabuleiro.showTabuleiro();
                            verificar = Verificacoes.verificaGanhador(tabuleiro.getTabuleiro(), jogador1, jogador2);
                        }
                        else {
                            tabuleiro.tabComJogada(posicao, jogador2.getCaractere());
                            tabuleiro.showTabuleiro();
                            verificar = Verificacoes.verificaGanhador(tabuleiro.getTabuleiro(), jogador1, jogador2);
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("Você não digitou um argumento válido\n:( VAMOS ENCERRAR O JOGO :(.");
                System.exit(0);
            }

            System.out.println("Deseja encerrar o jogo? Escreva: SIM para encerrar e NÃO para continuar.");
            reiniciar = sc.next().toUpperCase();
            if (reiniciar.equalsIgnoreCase("SIM")) {
                System.out.println("OK! Jogo encerrado até a próxima");
                System.exit(0);
            }
        } while (reiniciar != "SIM");


    }


    public static void Inicialize() {
        System.out.println("__________________________________________________\n" +
                "|                OKUBARO´S GAMES                 |\n" +
                "|                 JOGO DA VELHA                  |\n" +
                "|________________________________________________|");
        System.out.println("O jogo do dia:" + DateFormat.getDateInstance().format(new Date()) + "\n*PRECISAMOS DE 2 JOGADORES PARA INICIAR O JOGO*");
    }





}
