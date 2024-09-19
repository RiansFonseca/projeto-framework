package factory;

import builders.JogoBuilder;
import director.JogoDirector;
import model.Jogo;

// Factory Method
public abstract class JogoFactory {
    public Jogo criarJogo() {
        JogoBuilder builder = criarBuilder();
        JogoDirector director = new JogoDirector(builder);
        director.construirJogo();
        return director.getJogo();
    }

    protected abstract JogoBuilder criarBuilder();
}
