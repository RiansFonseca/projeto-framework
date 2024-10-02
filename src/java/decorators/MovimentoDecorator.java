package decorators;
import model.Peca;

// Exemplo de Decorator
public class MovimentoDecorator extends PecaDecorator {

    public MovimentoDecorator(Peca peca, String decoracao){
        super(peca, decoracao);
    }

    @Override
    public String toString() {
        return super.toString() + " " + decoracao;
    }
}
