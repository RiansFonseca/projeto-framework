package director;

import builders.JogoBuilder;
import model.Jogo;

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
