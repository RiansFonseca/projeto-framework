package builders;

import java.util.ArrayList;
import java.util.List;
import model.Casa;
import model.Jogo;
import model.Peca;
import proxy.TabuleiroProxy;
import regras.RegrasXadrez;

// Concrete Builder - Jogo Xadrez
public class JogoXadrezBuilder implements JogoBuilder {
    private Jogo jogo;

    public JogoXadrezBuilder() {
        this.jogo = new Jogo(); // Inicializa um novo jogo
    }

    @Override
    public void buildPecas() {
        List<Peca> pecas = new ArrayList<>();

        // Criando peças básicas
        Peca reiBranco = new Peca("Rei", "Branco");
        Peca rainhaBranca = new Peca("Rainha", "Branca");
        Peca torreBranca = new Peca("Torre", "Preta");
        Peca peaoPreto = new Peca("Peão", "Preto");

        // Adicionando as peças à lista
        pecas.add(reiBranco);
        pecas.add(rainhaBranca);
        pecas.add(torreBranca);
        pecas.add(peaoPreto);
        jogo.setPecas(pecas);
    }

    @Override
    public void buildTabuleiro() {
        Casa[][] tabuleiroCasas = new Casa[8][8]; // Cria um tabuleiro de tamanho x tamanho
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiroCasas[i][j] = new Casa(); // Inicializa cada casa
            }
        }

        // Instancia o TabuleiroProxy com o tabuleiro criado
        TabuleiroProxy tabuleiroProxy = new TabuleiroProxy(tabuleiroCasas, "Preto e Branco");

        // Define o tabuleiro no jogo como o proxy
        jogo.setTabuleiro(tabuleiroProxy); // Agora estamos passando um Tabuleiro
    }

    @Override
    public void buildRegras() {
        jogo.setRegras(RegrasXadrez.obterRegras());
    }

    @Override
    public void reset() {
        this.jogo = new Jogo();
    }

    @Override
    public Jogo getResult() {
        return jogo;
    }
}
