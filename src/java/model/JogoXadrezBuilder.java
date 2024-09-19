package model;

import java.util.ArrayList;
import java.util.List;

// Concrete Builder - Jogo Xadrez
public class JogoXadrezBuilder implements JogoBuilder {
    private Jogo jogo;

    public JogoXadrezBuilder() { this.jogo = new Jogo(); }

    @Override
    public void buildPecas() {
        List<Peca> pecas = new ArrayList<>();
        pecas.add(new Peca("Rei Branco"));
        pecas.add(new Peca("Rainha Branca"));
        pecas.add(new Peca("Torre Branca"));
        pecas.add(new Peca("Peao Preto"));
        // Adicione mais peças...
        jogo.setPecas(pecas);
    }

    @Override
    public void buildTabuleiro() { jogo.setTabuleiro("Tabuleiro de Xadrez 8x8"); }

    @Override
    public void buildRegras() { jogo.setRegras("Regras do Xadrez"); }

    @Override
    public void reset() { this.jogo = new Jogo(); }

    @Override
    public Jogo getResult() { return jogo; }
}
