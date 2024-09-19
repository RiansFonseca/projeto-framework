package factory;

import builders.JogoBuilder;
import builders.JogoXadrezBuilder;

// Fábrica concreta para Jogo de Xadrez
public class JogoXadrezFactory extends JogoFactory {
    @Override
    protected JogoBuilder criarBuilder() {
        return new JogoXadrezBuilder();
    }
}
