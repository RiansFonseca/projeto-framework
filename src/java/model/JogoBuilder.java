package model;

// Builder
public interface JogoBuilder {
    void buildPecas();
    void buildTabuleiro();
    void buildRegras();
    void reset();
    Jogo getResult();
}
