package decorators;

import model.Peca;

// Decorator
public abstract class PecaDecorator extends Peca {
    protected Peca pecaDecorada;

    public PecaDecorator(Peca peca) {
        super(peca.toString()); // Chama o construtor da Peca
        this.pecaDecorada = peca;
    }

    @Override
    public String toString() {
        return pecaDecorada.toString();
    }
}