package model;

// Peça
public class Peca {
    private String nome;
    private String corPeca;

    public Peca(String nome, String corPeca) {
        this.nome = nome;
        this.corPeca = corPeca;
    }

    public Peca renderiza() {
        return this;
    }

    @Override
    public String toString() {
        return "Peça ->" + nome + " " + corPeca;
    }
}
