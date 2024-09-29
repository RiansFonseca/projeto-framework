package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import proxy.TabuleiroProxy;

// Jogo
public class Jogo {
    private List<Peca> pecas = new ArrayList<>();
    private TabuleiroProxy tabuleiro; // Usando a interface Tabuleiro
    private List<String> regras;

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }

    public void setRegras(List<String> regras) {
        this.regras = regras;
    }

    public TabuleiroProxy getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(TabuleiroProxy tabuleiro) { // Altera o parâmetro para Tabuleiro
        this.tabuleiro = tabuleiro;
    }

    @Override
    public String toString() {
        String pecasString = String.join("\n-> ", pecas.stream().map(Peca::toString).toArray(String[]::new));
        String regrasString = String.join("", regras);

        return "\n=====================PECAS===================== \n-> " + pecasString
                + "\n=====================REGRAS===================== \n" + regrasString
                + "\n====================TABULEIRO==================== \n" + tabuleiro
                + "\n=================================================";
    }
}
