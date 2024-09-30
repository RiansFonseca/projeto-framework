
package facade;

import adapter.JogoJsonAdapter;
import factory.JogoDamasFactory;
import factory.JogoXadrezFactory;
import logger.JogoLogger;
import model.Jogo;

//Cliente
public class JogoFacade {

	private JogoXadrezFactory xadrezFactory;
	private JogoDamasFactory damasFactory;
	private JogoLogger jogoLogger;
	private Jogo jogo; // Mantenha a referência ao objeto Jogo

	public JogoFacade() {
		this.xadrezFactory = new JogoXadrezFactory();
		this.damasFactory = new JogoDamasFactory();
		this.jogoLogger = new JogoLogger();
		this.jogo = null; // Inicialize o jogo como nulo
	}

	// Método para iniciar uma partida de Xadrez
	public void iniciarPartidaXadrez() {
		this.jogo = xadrezFactory.criarJogo(); // Crie o jogo e mantenha a referência
		jogoLogger.getJogoString(jogo);
		jogoLogger.iniciarPartidaXadrez();
	}

	// Método para iniciar uma partida de Damas
	public void iniciarPartidaDamas() {
		this.jogo = damasFactory.criarJogo(); // Crie o jogo e mantenha a referência
		jogoLogger.getJogoString(jogo);
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

	// Método para obter o jogo em formato JSON
	public String getJogoJson() {
		JogoJsonAdapter adapter = new JogoJsonAdapter(jogo);
		return adapter.convert();
	}
}
