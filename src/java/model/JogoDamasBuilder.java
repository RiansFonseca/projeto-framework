package model;

import java.util.ArrayList;
import java.util.List;

// Concrete Builder - Jogo Damas
public class JogoDamasBuilder implements JogoBuilder {
    private Jogo jogo;

    public JogoDamasBuilder() { this.jogo = new Jogo(); }

    @Override
    public void buildPecas() {
        List<Peca> pecas = new ArrayList<>();
        pecas.add(new Peca("Peca Branca"));
        pecas.add(new Peca("Peca Preta"));
        // Adicione mais peças...
        jogo.setPecas(pecas);
    }

    @Override
    public void buildTabuleiro() { jogo.setTabuleiro("Tabuleiro de Damas 8x8"); }

    @Override
    public void buildRegras() { jogo.setRegras("Regras de Damas"); }

    @Override
    public void reset() { this.jogo = new Jogo(); }

    @Override
    public Jogo getResult() { return jogo; }
}