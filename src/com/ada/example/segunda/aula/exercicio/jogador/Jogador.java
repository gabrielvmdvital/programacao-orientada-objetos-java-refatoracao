package com.ada.example.segunda.aula.exercicio.jogador;

public class Jogador {
    private String nome;
    private char caractere;

    public Jogador(String nome, char caractere){
        setCaractere(caractere);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getCaractere() {
        return caractere;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }


    public void showWinner() {
        System.out.println(getNome() + " VENCEU A PARTIDA!");
    }
}
