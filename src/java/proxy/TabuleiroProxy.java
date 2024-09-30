package proxy;

import model.Casa;

import model.Casa;

// TabuleiroProxy.java
public class TabuleiroProxy implements Tabuleiro {
    private TabuleiroReal tabuleiroReal;
    private Casa[][] tabuleiro;

    public TabuleiroProxy(Casa[][] tabuleiro, String cor) {
        this.tabuleiro = tabuleiro;
        this.tabuleiroReal = new TabuleiroReal(tabuleiro, cor);
    }

    @Override
    public boolean moverPeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
        // Verifica se a casa de origem está dentro dos limites
        if (linhaOrigem < 0 || linhaOrigem >= tabuleiro.length || colunaOrigem < 0
                || colunaOrigem >= tabuleiro[0].length) {
            System.out.println("Casa de origem inválida.");
            return false; // Origem inválida
        }

        // Verifica se a casa de destino está dentro dos limites
        if (linhaDestino < 0 || linhaDestino >= tabuleiro.length || colunaDestino < 0
                || colunaDestino >= tabuleiro[0].length) {
            System.out.println("Casa de destino inválida.");
            return false; // Destino inválido
        }

        Casa casaOrigem = tabuleiro[linhaOrigem][colunaOrigem];
        Casa casaDestino = tabuleiro[linhaDestino][colunaDestino];

        // Verifica se a casa de origem tem uma peça
        if (casaOrigem.getPeca() == null) {
            System.out.println("Não há peça na casa de origem.");
            return false; // Não há peça para mover
        }

        // Verifica se a casa de destino está vazia
        if (!casaDestino.isVazia()) {
            System.out.println("A casa de destino já está ocupada.");
            return false; // Destino ocupado
        }

        // Se todas as verificações forem bem-sucedidas, move a peça usando o
        // TabuleiroReal
        tabuleiroReal.moverPeca(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino);
        System.out.println("Movimento realizado com sucesso.");
        return true; // Movimento bem-sucedido
    }

    @Override
    public Casa[][] getCasas() {
        return tabuleiroReal.getCasas();
    }

    @Override
    public String toString() {
        int tamanho = tabuleiro.length; // Obtém o tamanho do tabuleiro (N)
        return "TABULEIRO DE " + tamanho + "x" + tamanho;
    }

    @Override
    public void setCorTabuleiro(String novaCor) {
        tabuleiroReal.setCorTabuleiro(novaCor);
    }

}
