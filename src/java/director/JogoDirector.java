package director;

import model.Jogo;
import model.JogoBuilder;

// Director
public class JogoDirector {
    private JogoBuilder builder;

    public JogoDirector(JogoBuilder builder) {
        this.builder = builder;
    }

    public void construirJogo() {
        builder.reset();
        builder.buildTabuleiro();
        builder.buildPecas();
        builder.buildRegras();
    }

    public Jogo getJogo() {
        return builder.getResult();
    }
}
