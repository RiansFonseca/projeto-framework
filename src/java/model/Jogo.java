package model;

import java.util.ArrayList;
import java.util.List;

import proxy.TabuleiroProxy;

//Classe Jogo
public class Jogo {
    private List<Peca> pecasBrancas; // Lista de peças brancas
    private List<Peca> pecasPretas;   // Lista de peças pretas
    private TabuleiroProxy tabuleiro;  // Usando a interface Tabuleiro
    private List<String> regras;       // Regras do jogo

    // Construtor
    public Jogo() {
        this.pecasBrancas = new ArrayList<>(); // Inicializa a lista de peças brancas
        this.pecasPretas = new ArrayList<>();   // Inicializa a lista de peças pretas
        this.regras = new ArrayList<>();         // Inicializa a lista de regras
    }

    // Métodos de acesso (Getters e Setters)
    public List<Peca> getPecasBrancas() {
        return pecasBrancas;
    }

    public List<Peca> getPecasPretas() {
        return pecasPretas;
    }

    public TabuleiroProxy getTabuleiro() {
        return tabuleiro;
    }

	public List<String> getRegras() {
        return regras;
    }

    public void setTabuleiro(TabuleiroProxy tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void setRegras(List<String> regras) {
        this.regras = regras;
    }

	public void setPecas(List<Peca> pecasBrancas, List<Peca> pecasPretas) {
        this.pecasBrancas = pecasBrancas;
		this.pecasPretas = pecasPretas;
    }

    // Método para adicionar uma peça branca
    public void adicionarPecaBranca(Peca peca) {
        this.pecasBrancas.add(peca);
    }

    // Método para adicionar uma peça preta
    public void adicionarPecaPreta(Peca peca) {
        this.pecasPretas.add(peca);
    }

    // Método para adicionar uma regra
    public void adicionarRegra(String regra) {
        this.regras.add(regra);
    }

    @Override
    public String toString() {
        // Formatação das peças
        String pecasBrancasString = String.join("\n", pecasBrancas.stream().map(Peca::toString).toArray(String[]::new));
        String pecasPretasString = String.join("\n", pecasPretas.stream().map(Peca::toString).toArray(String[]::new));
        
        // Formatação das regras
        String regrasString = String.join("\n", regras);
        
        return "\n\nTABULEIRO: \n\n" + tabuleiro
				+"\n\nPEÇAS BRANCAS:\n\n" + pecasBrancasString
                + "\n\nPEÇAS PRETAS: \n\n" + pecasPretasString
                + "\n\nREGRAS: \n\n" + regrasString
                + "\n";
    }
}