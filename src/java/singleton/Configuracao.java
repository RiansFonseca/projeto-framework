package singleton;

import java.util.List;

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

    public void setCorPecas(String corPecas, List<Peca> pecas) {
        this.corPecas = corPecas;
        // ITERAÇÃO PARA TROCAR A COR DAS PECAS DA LISTA PASSADA POR PARAMETRO
    }
}