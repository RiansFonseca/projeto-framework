package decorators;

import model.Peca;

// Concrete Decorator - AdornosVermelhosDecorator
public class AdornosVermelhosDecorator extends PecaDecorator {

    public AdornosVermelhosDecorator(String peca) {
        super(peca);
    }

    @Override
    public String renderiza() {
        return super.renderiza() + " com adornos vermelhos";
    }
}
