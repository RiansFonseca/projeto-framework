package singleton;

import java.util.List;

import decorators.PecaDecorator;
import iterator.PecaIterator;
import model.Peca;
import proxy.TabuleiroProxy;

public class Configuracao {
    // Propriedades de configuração
    private int tempoLimitePartida;
    private String corTabuleiro;
    private String corPecas;
    private TabuleiroProxy tabuleiroProxy;

    // Instância única da classe Configuracao
    private static Configuracao instancia;

    // Construtor privado para evitar instanciamento externo
    private Configuracao() {
        // Inicialização com valores padrão
        this.tempoLimitePartida = 30000; // tempo em segundos
        this.corTabuleiro = "Preto e Branco"; // Cor padrão do tabuleiro
        this.corPecas = "Preto e Branco"; // Cor padrão das peças
    }

    // Método para obter a instância única
    public static synchronized Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    // Getters e Setters para as propriedades
    public int getTempoLimitePartida() {
        return tempoLimitePartida;
    }

    public void setTempoLimitePartida(int tempoLimitePartida) {
        this.tempoLimitePartida = tempoLimitePartida;
    }

    public String getCorTabuleiro() {
        return corTabuleiro;
    }

    public void setCorTabuleiro(String corTabuleiro, TabuleiroProxy tabuleiro) {
        this.corTabuleiro = corTabuleiro;
        tabuleiro.setCorTabuleiro(corTabuleiro);
    }

    public String getCorPecas() {
        return corPecas;
    }

    // Método para trocar cor das peças
    public void setCorPecas(String corPecas, List<Peca> pecas) {
        this.corPecas = corPecas;

        // Cria um iterador para a lista de peças
        PecaIterator iterator = new PecaIterator(pecas);

        // Itera sobre as peças e altera a cor
        while (iterator.hasNext()) {
            Peca peca = iterator.next();
            peca.setCor(corPecas);  // Define a cor da peça
        }
    }

   // Método para adicionar decorators às peças
    public void adicionarPecasDecorator(List<Peca> pecas, PecaDecorator decorator) {
        
        PecaIterator iterator = new PecaIterator(pecas);

        while (iterator.hasNext()) {
            Peca peca = iterator.next();
            Peca pecaDecorada = decorator;  // Aplica o decorator à peça
            pecas.set(pecas.indexOf(peca), pecaDecorada);  // Substitui a peça original pela peça decorada
        }
    }
}