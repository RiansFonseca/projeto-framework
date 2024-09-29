package decorators;

import model.Peca;

// Concrete Decorator - BrilhoVerdeDecorator
public class MovimentoComBrilhoVerdeDecorator extends PecaDecorator {

    public MovimentoComBrilhoVerdeDecorator(String peca) {
        super(peca);
    }

    @Override
    public String toString() {
        return super.toString() + "Movimento com Brilho Verde";
    }
}