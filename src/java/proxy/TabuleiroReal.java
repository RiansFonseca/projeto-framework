package proxy;

import model.Casa;

import model.Casa;

// TabuleiroReal.java
public class TabuleiroReal implements Tabuleiro {
    private Casa[][] tabuleiro;

    public TabuleiroReal(Casa[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
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
}
