package decorators;

import model.Peca;

// Decorator
public abstract class PecaDecorator extends Peca {
<<<<<<< HEAD
    protected Peca pecaDecorada;

    public PecaDecorator(Peca peca) {
        super(peca.toString()); // Chama o construtor da Peca
        this.pecaDecorada = peca;
=======

    public PecaDecorator(String pecaDecorada) {
        super(pecaDecorada);
    }

    @Override
    public String renderiza() {
        return super.getNome();
>>>>>>> 9e20a14 (Adapter)
    }

    @Override
    public String toString() {
        return pecaDecorada.toString();
    }
}