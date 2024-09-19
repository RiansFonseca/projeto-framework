package model;

import java.util.ArrayList;
import java.util.List;

// Jogo
public class Jogo {
    private List<Peca> pecas = new ArrayList<>();
    private Casa[][] tabuleiro; // Matriz de casas
    private String regras;

    public void setPecas(List<Peca> pecas) { this.pecas = pecas; }
    public void setRegras(String regras) { this.regras = regras; }

    @Override
    public String toString() {
        return "Jogo [pecas=" + pecas + ", regras=" + regras + "]";
    }

    public Casa[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Casa[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}
