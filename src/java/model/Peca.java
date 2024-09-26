package model;

// Peça
public class Peca {
    private String nome;

    public Peca(String nome) {
        this.nome = nome;
    }

    public String renderiza() {
        return nome;
    }

    @Override
    public String toString() {
        return "Peça" + nome;
    }
}
