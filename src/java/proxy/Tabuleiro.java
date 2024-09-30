package proxy;

import model.Casa;

// Tabuleiro.java
public interface Tabuleiro {
    boolean moverPeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino);

    Casa[][] getCasas();

    void setCorTabuleiro(String novaCor);

}
