package decorators;

import model.Peca;

// Concrete Decorator - AdornosVermelhosDecorator
public class AdornosVermelhosDecorator extends PecaDecorator {

    public AdornosVermelhosDecorator(Peca peca) {
        super(peca);
    }

    @Override
    public String toString() {
        return super.toString() + " com adornos vermelhos";
    }
}

