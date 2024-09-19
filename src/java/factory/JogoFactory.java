package factory;

import director.JogoDirector;
import model.Jogo;
import model.JogoBuilder;

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
