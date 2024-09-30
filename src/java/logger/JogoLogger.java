package logger;

import model.Jogo;

public class JogoLogger {

    public JogoLogger() {
    }

    // Método para iniciar uma partida de Xadrez
    public void iniciarPartidaXadrez() {
        System.out.println("LOG: Iniciando partida de Xadrez.");
    }

    // Método para iniciar uma partida de Damas
    public void iniciarPartidaDamas() {
        System.out.println("LOG: Iniciando partida de Damas.");
    }

    // Método para terminar a partida de Xadrez
    public void terminarPartidaXadrez() {
        System.out.println("LOG: Terminando partida de Xadrez.");
    }

    // Método para terminar a partida de Damas
    public void terminarPartidaDamas() {
        System.out.println("LOG: Terminando partida de Damas.");
    }

    public void getJogoString(Jogo jogo) {
        System.out.println(jogo);
    }

}
