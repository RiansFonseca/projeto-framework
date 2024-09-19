package factory;

import model.JogoBuilder;
import model.JogoDamasBuilder;

// Fábrica concreta para Jogo de Damas
public class JogoDamasFactory extends JogoFactory {
    @Override
    protected JogoBuilder criarBuilder() {
        return new JogoDamasBuilder();
    }
}
