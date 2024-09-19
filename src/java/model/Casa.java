package model;

// Classe para representar uma casa no tabuleiro
public class Casa {
    private Peca peca;

    public Casa() {
        this.peca = null; // Inicialmente, a casa está vazia
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public boolean isVazia() {
        return peca == null;
    }
}
