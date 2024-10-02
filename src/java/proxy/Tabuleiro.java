package proxy;

import model.Casa;

public interface Tabuleiro {
    boolean moverPeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino);

    Casa[][] getCasas();

    void setCorTabuleiro(String novaCor);

    String getTamanho(); // Adicionando o método getTamanho
}
