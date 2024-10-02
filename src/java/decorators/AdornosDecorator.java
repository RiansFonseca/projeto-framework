package decorators;
import model.Peca;

// Exemplo de Decorator
public class AdornosDecorator extends PecaDecorator {

    public AdornosDecorator(Peca peca, String decoracao) {
        super(peca, decoracao);
    }

    @Override
    public String toString() {
        return super.toString() + " " + decoracao;
    }
}

