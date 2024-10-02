package builders;

import java.util.ArrayList;
import java.util.List;

import model.Casa;
import model.Jogo;
import model.Peca;
import model.PecaBranca;
import model.PecaPreta;
import proxy.TabuleiroProxy;
import regras.RegrasDamas;

// Concrete Builder - Jogo Damas
public class JogoDamasBuilder implements JogoBuilder {
    private Jogo jogo;

    public JogoDamasBuilder() {
        this.jogo = new Jogo(); // Inicializa um novo jogo
    }

    @Override
    public void buildPecas() {
        List<Peca> pecasBrancas = new ArrayList<>();
        List<Peca> pecasPretas = new ArrayList<>();
    
        // Criando uma peça base para clonagem
        PecaBranca peaoBranco = new PecaBranca("Peão");
        PecaPreta peaoPreto = new PecaPreta("Peão");

        pecasBrancas.add(peaoBranco);
        pecasPretas.add(peaoPreto);
    
        // Clonando e adicionando 12 peças brancas
        for (int i = 0; i < 11; i++) {
            try {
                pecasBrancas.add((PecaBranca) peaoBranco.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    
        // Clonando e adicionando 12 peças pretas
        for (int i = 0; i < 11; i++) {
            try {
                pecasPretas.add((PecaPreta) peaoPreto.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    
        // Definindo as peças no jogo
        jogo.setPecas(pecasBrancas, pecasPretas);
    }

    @Override
    public void buildTabuleiro() {
        Casa[][] tabuleiroCasas = new Casa[8][8]; // Cria um tabuleiro de tamanho x tamanho
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiroCasas[i][j] = new Casa(); // Inicializa cada casa
            }
        }

        // Instancia o TabuleiroProxy com o tabuleiro criado
        TabuleiroProxy tabuleiroProxy = new TabuleiroProxy(tabuleiroCasas, "Preto e Branco");

        // Define o tabuleiro no jogo como o proxy
        jogo.setTabuleiro(tabuleiroProxy); // Agora estamos passando um Tabuleiro
    }

    @Override
    public void buildRegras() {
        jogo.setRegras(RegrasDamas.obterRegras());
    }

    @Override
    public void reset() {
        this.jogo = new Jogo();
    }

    @Override
    public Jogo getResult() {
        return jogo;
    }
}