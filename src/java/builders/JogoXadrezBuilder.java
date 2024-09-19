package builders;

import java.util.ArrayList;
import java.util.List;
import model.Casa;
import model.Jogo;
import model.Peca;


// Concrete Builder - Jogo Xadrez
public class JogoXadrezBuilder implements JogoBuilder {
    private Jogo jogo;

    public JogoXadrezBuilder() { 
        this.jogo = new Jogo(); // Inicializa um novo jogo
    }

    @Override
    public void buildPecas() {
        List<Peca> pecas = new ArrayList<>();
        
        // Criando peças básicas
        Peca reiBranco = new Peca("Rei Branco");
        Peca rainhaBranca = new Peca("Rainha Branca");
        Peca torreBranca = new Peca("Torre Branca");
        Peca peaoPreto = new Peca("Peão Preto");

        // Adicionando as peças à lista
        pecas.add(reiBranco);
        pecas.add(rainhaBranca);
        pecas.add(torreBranca);
        pecas.add(peaoPreto);
        jogo.setPecas(pecas);
    }

    @Override
    public void buildTabuleiro() { 
        Casa[][] tabuleiro = new Casa[8][8]; // Cria um tabuleiro 8x8
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = new Casa(); // Inicializa cada casa
            }
        }
        jogo.setTabuleiro(tabuleiro); // Define o tabuleiro no jogo
    }

    @Override
    public void buildRegras() { jogo.setRegras("Regras do Xadrez"); }

    @Override
    public void reset() { this.jogo = new Jogo(); }

    @Override
    public Jogo getResult() { return jogo; }
}
