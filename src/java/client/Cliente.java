package client;

import factory.JogoDamasFactory;
import factory.JogoFactory;
import factory.JogoXadrezFactory;
import model.Jogo;

// Cliente
public class Cliente {
    public static void main(String[] args) {
        // Usando a fábrica para criar um jogo de Xadrez
        JogoFactory factory = new JogoXadrezFactory();
        Jogo jogo = factory.criarJogo();
        System.out.println(jogo);

        // Usando a fábrica para criar um jogo de Damas
        factory = new JogoDamasFactory();
        jogo = factory.criarJogo();
        System.out.println(jogo);
    }
}
