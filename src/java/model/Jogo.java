package model;

import java.util.ArrayList;
import java.util.List;

// Produto
public class Jogo {
    private List<Peca> pecas = new ArrayList<>();
    private String tabuleiro;
    private String regras;

    public void setPecas(List<Peca> pecas) { this.pecas = pecas; }
    public void setTabuleiro(String tabuleiro) { this.tabuleiro = tabuleiro; }
    public void setRegras(String regras) { this.regras = regras; }

    @Override
    public String toString() {
        return "Jogo [pecas=" + pecas + ", tabuleiro=" + tabuleiro + ", regras=" + regras + "]";
    }
}
