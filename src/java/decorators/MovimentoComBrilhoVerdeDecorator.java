package decorators;

import model.Peca;

// Concrete Decorator - BrilhoVerdeDecorator
public class MovimentoComBrilhoVerdeDecorator extends PecaDecorator {

    public MovimentoComBrilhoVerdeDecorator(String peca) {
        super(peca);
    }

    @Override
    public String renderiza() {
        return super.renderiza() + " com brilho verde no movimento";
    }
}