package decorators;

import model.Peca;

// Decorator
public abstract class PecaDecorator extends Peca {
    protected String pecaDecorada;

    public PecaDecorator(String peca) {
        super(peca);
        this.pecaDecorada = peca;
    }

    @Override
    public String renderiza() {
        return pecaDecorada.toString();
    }
}