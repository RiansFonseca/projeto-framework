package decorators;

import model.Peca;

// Concrete Decorator - BrilhoVerdeDecorator
public class MovimentoComBrilhoVerdeDecorator extends PecaDecorator {
    
    public MovimentoComBrilhoVerdeDecorator(Peca peca) {
        super(peca);
    }

    @Override
    public String toString() {
        return super.toString() + " com brilho verde";
    }
}