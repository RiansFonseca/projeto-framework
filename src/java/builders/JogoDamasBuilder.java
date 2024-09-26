package builders;

import decorators.AdornosVermelhosDecorator;
import java.util.ArrayList;
import java.util.List;
import model.Casa;
import model.Jogo;
import model.Peca;
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
        List<Peca> pecas = new ArrayList<>();

        // Instanciando as peças apenas com nome
        Peca pecaBranca = new Peca("Peca Branca");
        Peca pecaPreta = new Peca("Peca Preta");

        // Aplicando o decorator para adicionar adornos vermelhos
        Peca pecaBrancaComAdornos = new AdornosVermelhosDecorator(pecaBranca.renderiza());
        Peca pecaPretaComAdornos = new AdornosVermelhosDecorator(pecaPreta.renderiza());

        System.out.println(pecaBrancaComAdornos.renderiza());
        System.out.println(pecaPretaComAdornos.renderiza());

        // Adicionando as peças decoradas à lista
        pecas.add(pecaBrancaComAdornos);
        pecas.add(pecaPretaComAdornos);

        // Definindo as peças no jogo
        jogo.setPecas(pecas);
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
        TabuleiroProxy tabuleiroProxy = new TabuleiroProxy(tabuleiroCasas);

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