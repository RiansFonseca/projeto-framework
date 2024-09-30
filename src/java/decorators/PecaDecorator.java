package decorators;

import model.Peca;

// Decorator
public abstract class PecaDecorator extends Peca {

    public PecaDecorator(String pecaDecorada) {
        super(pecaDecorada);
    }

    @Override
    public String renderiza() {
        return super.getNome();
    }
}