package model;

import java.util.ArrayList;
import java.util.List;

import proxy.TabuleiroProxy;

//Classe Jogo
//Classe Jogo
public class Jogo {
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
	     String pecasString = String.join("\n", pecas.stream().map(Peca::toString).toArray(String[]::new));
	     // Formatação das regras
	     String regrasString = String.join("\n ", regras);
	     
	     return "\nPECAS: \n " + pecasString
	             + "\nREGRAS: \n " + regrasString
	             + "\nTABULEIRO: \n " + tabuleiro;
	 }
}