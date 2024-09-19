package builders;

import model.Jogo;

// Builder
public interface JogoBuilder {
    void buildPecas();
    void buildTabuleiro();
    void buildRegras();
    void reset();
    Jogo getResult();
}
