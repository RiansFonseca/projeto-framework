package facade;

import factory.JogoDamasFactory;
import factory.JogoXadrezFactory;
import logger.JogoLogger;

public class JogoFacade {

    private JogoXadrezFactory xadrezFactory;
    private JogoDamasFactory damasFactory;
    private JogoLogger jogoLogger;

    public JogoFacade() {
        // Instancia as fábricas no construtor
        this.xadrezFactory = new JogoXadrezFactory();
        this.damasFactory = new JogoDamasFactory();
        this.jogoLogger = new JogoLogger();
    }

    // Método para iniciar uma partida de Xadrez
    public void iniciarPartidaXadrez() {
        jogoLogger.getJogoString(xadrezFactory.criarJogo());
        jogoLogger.iniciarPartidaXadrez();
    }

    // Método para iniciar uma partida de Damas
    public void iniciarPartidaDamas() {
        jogoLogger.getJogoString(damasFactory.criarJogo());
        jogoLogger.iniciarPartidaDamas();
    }

    // Método para terminar a partida de Xadrez
    public void terminarPartidaXadrez() {
        jogoLogger.terminarPartidaXadrez();
    }

    // Método para terminar a partida de Damas
    public void terminarPartidaDamas() {
        jogoLogger.terminarPartidaDamas();
    }

}