package proxy;

import model.Casa;

public class TabuleiroProxy {
    private TabuleiroReal tabuleiroReal;
    private Casa[][] tabuleiro;

    public TabuleiroProxy(Casa[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
        this.tabuleiroReal = new TabuleiroReal(tabuleiro);
    }

    public boolean moverPeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
        // Verifica se a casa de origem e a casa de destino estão dentro dos limites
        if (linhaOrigem < 0 || linhaOrigem >= tabuleiro.length || colunaOrigem < 0 || colunaOrigem >= tabuleiro[0].length) {
            System.out.println("Casa de origem inválida.");
            return false; // Origem inválida
        }
        if (linhaDestino < 0 || linhaDestino >= tabuleiro.length || colunaDestino < 0 || colunaDestino >= tabuleiro[0].length) {
            System.out.println("Casa de destino inválida.");
            return false; // Destino inválido
        }

        // Verifica se o movimento é permitido e chama o tabuleiro real para mover a peça
        boolean resultado = tabuleiroReal.moverPeca(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino);
        if (resultado) {
            System.out.println("Movimento realizado com sucesso.");
        } else {
            System.out.println("Movimento inválido.");
        }
        return resultado;
    }
}

