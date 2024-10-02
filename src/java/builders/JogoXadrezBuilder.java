package builders;

import java.util.ArrayList;
import java.util.List;

import decorators.AdornosDecorator;
import facade.JogoFacade;
import model.Casa;
import model.Jogo;
import model.Peca;
import model.PecaBranca;
import model.PecaPreta;
import proxy.TabuleiroProxy;
import regras.RegrasXadrez;

// Concrete Builder - Jogo Xadrez
public class JogoXadrezBuilder implements JogoBuilder {
    private Jogo jogo;
    private JogoFacade facade;
    private AdornosDecorator adornosVermelhosDecorator;

    public JogoXadrezBuilder() {
        this.jogo = new Jogo(); 
        this.facade = new JogoFacade();
    }

    @Override
    public void buildPecas() {
        List<Peca> pecasBrancas = new ArrayList<>();
        List<Peca> pecasPretas = new ArrayList<>();

        // Criando peças base para clonagem
        PecaBranca reiBranco = new PecaBranca("Rei");
        PecaBranca rainhaBranca = new PecaBranca("Rainha");
        PecaBranca cavaloBranco = new PecaBranca("Cavalo");
        PecaBranca bispoBranco = new PecaBranca("Bispo");
        PecaBranca torreBranca = new PecaBranca("Torre");
        PecaBranca peaoBranco = new PecaBranca("Peão");
        
        PecaPreta reiPreto = new PecaPreta("Rei");
        PecaPreta rainhaPreta = new PecaPreta("Rainha");
        PecaPreta cavaloPreto = new PecaPreta("Cavalo");
        PecaPreta bispoPreto = new PecaPreta("Bispo");
        PecaPreta torrePreta = new PecaPreta("Torre");
        PecaPreta peaoPreto = new PecaPreta("Peão");

        pecasBrancas.add(reiBranco);
        pecasBrancas.add(rainhaBranca);
        pecasBrancas.add(cavaloBranco);
        pecasBrancas.add(torreBranca);
        pecasBrancas.add(bispoBranco);

        pecasPretas.add(reiPreto);
        pecasPretas.add(rainhaPreta);
        pecasPretas.add(cavaloPreto);
        pecasPretas.add(torrePreta);
        pecasPretas.add(bispoPreto);

        try {
            pecasBrancas.add((Peca) torreBranca.clone());
            pecasBrancas.add((Peca) bispoBranco.clone());
            pecasBrancas.add((Peca) cavaloBranco.clone());
            for (int i = 0; i < 8; i++) {
                pecasBrancas.add((Peca) peaoBranco.clone());
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        try {
            pecasPretas.add((Peca) torrePreta.clone());
            pecasPretas.add((Peca) bispoPreto.clone());
            pecasPretas.add((Peca) cavaloPreto.clone());
            for (int i = 0; i < 8; i++) {
                pecasPretas.add((Peca) peaoPreto.clone());
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Adicionando o decorator às peças pretas
        for (int i = 0; i < pecasPretas.size(); i++) {
            Peca peca = pecasPretas.get(i);
            AdornosDecorator decorator = new AdornosDecorator(peca, "com Adornos Vermelhos");
            pecasPretas.set(i, decorator);
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
        jogo.setRegras(RegrasXadrez.obterRegras());
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
