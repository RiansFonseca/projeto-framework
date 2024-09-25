package model;

import java.util.ArrayList;
import java.util.List;
import proxy.TabuleiroProxy;

// Jogo
public class Jogo {
    private List<Peca> pecas = new ArrayList<>();
    private TabuleiroProxy tabuleiro; // Usando a interface Tabuleiro
    private String regras;

    public void setPecas(List<Peca> pecas) { this.pecas = pecas; }
    public void setRegras(String regras) { this.regras = regras; }

    public TabuleiroProxy getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(TabuleiroProxy tabuleiro) { // Altera o parâmetro para Tabuleiro
        this.tabuleiro = tabuleiro;
    }

    @Override
    public String toString() {
        return "Jogo [pecas=" + pecas + ", regras=" + regras + ", tabuleiro=" + tabuleiro + "]";
    }
}

