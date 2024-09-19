package builders;

import java.util.ArrayList;
import java.util.List;
import model.Casa;
import model.Jogo;
import model.Peca;

// Concrete Builder - Jogo Damas
public class JogoDamasBuilder implements JogoBuilder {
    private Jogo jogo;

    public JogoDamasBuilder() { 
        this.jogo = new Jogo(); // Inicializa um novo jogo
    }

    @Override
    public void buildPecas() {
        List<Peca> pecas = new ArrayList<>();
        pecas.add(new Peca("Peca Branca"));
        pecas.add(new Peca("Peca Preta"));
        // Adicione mais peças...
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
    public void buildRegras() { jogo.setRegras("Regras de Damas"); }

    @Override
    public void reset() { this.jogo = new Jogo(); }

    @Override
    public Jogo getResult() { return jogo; }
}