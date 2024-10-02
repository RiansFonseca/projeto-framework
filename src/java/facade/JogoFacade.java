
package facade;

import java.util.ArrayList;
import java.util.List;

import adapter.JogoJsonAdapter;
import decorators.PecaDecorator;
import factory.JogoDamasFactory;
import factory.JogoXadrezFactory;
import iterator.ObserverIterator;
import model.Jogo;
import model.Peca;
import observer.EventosDeUI;
import observer.Observer;
import proxy.TabuleiroProxy;
import singleton.Configuracao;


public class JogoFacade implements EventosDeUI{

    private JogoXadrezFactory xadrezFactory;
    private JogoDamasFactory damasFactory;
    private Jogo jogo;
    private Configuracao configuracao;
	private ObserverIterator observerIterator;
	private List<Observer> observadores = new ArrayList<>();


    public JogoFacade() {
        this.xadrezFactory = new JogoXadrezFactory();
        this.damasFactory = new JogoDamasFactory();
        this.jogo = null;
        this.configuracao = Configuracao.getInstance();
		this.observerIterator = new ObserverIterator(observadores);
    }

    // Método para iniciar uma partida de Xadrez
    public void iniciarJogoXadrez() {
		this.jogo = xadrezFactory.criarJogo();
		notificarObservadores("CRIANDO JOGO DE XADREZ...", jogo);
    }

    // Método para iniciar uma partida de Damas
    public void iniciarJogoDamas() {
		this.jogo = damasFactory.criarJogo();
		notificarObservadores("CRIANDO JOGO DE DAMAS...", jogo);
    }

    // Método para terminar a partida de Xadrez
    public void terminarJogoXadrez() {
		this.jogo = null;
        notificarObservadores("TERMINANDO JOGO DE XADREZ...", null);
    }

    // Método para terminar a partida de Damas
    public void terminarJogoDamas() {
		this.jogo = null;
        notificarObservadores("TERMINANDO EM FORMATO JSON:", null);
    }

    // Método para obter o jogo em formato JSON
    public void getJogoJson() {
		JogoJsonAdapter adapter = new JogoJsonAdapter(jogo);
        notificarObservadores("JOGO EM FORMATO JSON-", adapter);
    }


    // Método para configurar a cor do tabuleiro
    public void setCorTabuleiro(String corTabuleiro, TabuleiroProxy tabuleiro) {
        configuracao.setCorTabuleiro(corTabuleiro, tabuleiro);
		notificarObservadores("COR DO TABULEIRO ALTERADA!", null);
    }

    // Método para configurar a cor das peças
    public void setCorPecas(String corPecas, List<Peca> pecas) {
        configuracao.setCorPecas(corPecas, pecas);
		notificarObservadores("COR DAS PEÇAS ALTERADA!", null);
    }

    // Método para adicionar decorators às peças
    public void adicionarPecasDecorator(List<Peca> pecas, PecaDecorator decorator) {
        configuracao.adicionarPecasDecorator(pecas, decorator);
		notificarObservadores("DECORATOR ADICIONADO ÀS PEÇAS!", null);
    }

	@Override
	public void adicionarObservadores(Observer observer) {
		observadores.add(observer);
	}

	@Override
	public void removerObservadores(Observer observer) {
		observadores.remove(observer);
	}

	@Override
	public void notificarObservadores(String descricao, Object obj) {
		observerIterator.notificar(descricao, obj);
	}
}
