package proxy;

import model.Casa;

// TabuleiroReal.java
public class TabuleiroReal implements Tabuleiro {
    private Casa[][] tabuleiro;
    private String corTabuleiro;

    public TabuleiroReal(Casa[][] tabuleiro, String corTabuleiro) {
        this.tabuleiro = tabuleiro;
        this.corTabuleiro = corTabuleiro;
    }

    @Override
    public boolean moverPeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
        Casa casaOrigem = tabuleiro[linhaOrigem][colunaOrigem];
        Casa casaDestino = tabuleiro[linhaDestino][colunaDestino];

        // Move a peça sem realizar verificações
        casaDestino.setPeca(casaOrigem.getPeca());
        casaOrigem.setPeca(null); // Limpa a casa de origem
        return true; // Movimento bem-sucedido
    }

    @Override
    public Casa[][] getCasas() {
        return tabuleiro;
    }

    @Override
    public void setCorTabuleiro(String novaCor) {
        this.corTabuleiro = novaCor;
    }
}
