package model;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> 9e20a14 (Adapter)
import proxy.TabuleiroProxy;

//Classe Jogo
public class Jogo {
<<<<<<< HEAD
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

=======
	 private List<Peca> pecas;  // Lista de peças do jogo
	 private TabuleiroProxy tabuleiro; // Usando a interface Tabuleiro
	 private List<String> regras;  // Regras do jogo
	
	 // Construtor
	 public Jogo() {
	     this.pecas = new ArrayList<>(); // Inicializa a lista de peças
	     this.regras = new ArrayList<>(); // Inicializa a lista de regras
	 }
	
	 // Métodos de acesso (Getters e Setters)
	 public List<Peca> getPecas() {
	     return pecas;
	 }
	
	 public void setPecas(List<Peca> pecas) {
	     this.pecas = pecas;
	 }
	
	 public TabuleiroProxy getTabuleiro() {
	     return tabuleiro;
	 }
	
	 public void setTabuleiro(TabuleiroProxy tabuleiro) {
	     this.tabuleiro = tabuleiro;
	 }
	
	 public List<String> getRegras() {
	     return regras;
	 }
	
	 public void setRegras(List<String> regras) {
	     this.regras = regras;
	 }
	
	 // Método para adicionar uma peça
	 public void adicionarPeca(Peca peca) {
	     this.pecas.add(peca);
	 }
	
	 // Método para adicionar uma regra
	 public void adicionarRegra(String regra) {
	     this.regras.add(regra);
	 }
	
	 @Override
	 public String toString() {
	     // Formatação das peças
	     String pecasString = String.join(" ", pecas.stream().map(Peca::toString).toArray(String[]::new));
	     // Formatação das regras
	     String regrasString = String.join("\n ", regras);
	     
	     return "\nPECAS: \n " + pecasString
	             + "\nREGRAS: \n " + regrasString
	             + "\nTABULEIRO: \n " + tabuleiro;
	 }
}
>>>>>>> 9e20a14 (Adapter)
