package proxy;

import model.Casa;

public class TabuleiroReal {
    private Casa[][] tabuleiro;

    public TabuleiroReal(Casa[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public boolean moverPeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
        // Verifica se as coordenadas estão dentro dos limites
        if (linhaDestino < 0 || linhaDestino >= tabuleiro.length || colunaDestino < 0 || colunaDestino >= tabuleiro[0].length) {
            return false; // Movimento inválido
        }

        Casa casaOrigem = tabuleiro[linhaOrigem][colunaOrigem];
        Casa casaDestino = tabuleiro[linhaDestino][colunaDestino];

        // Verifica se a casa de origem tem uma peça e se a casa de destino está vazia
        if (casaOrigem.getPeca() != null && casaDestino.isVazia()) {
            // Move a peça
            casaDestino.setPeca(casaOrigem.getPeca());
            casaOrigem.setPeca(null); // Limpa a casa de origem
            return true; // Movimento bem-sucedido
        }
        return false; // Movimento inválido
    }
}

