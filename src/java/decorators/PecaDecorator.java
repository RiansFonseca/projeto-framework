package decorators;

import model.Peca;

// Classe base para os decorators
public abstract class PecaDecorator extends Peca {
    protected Peca peca;
    protected String decoracao;

    public PecaDecorator(Peca peca, String decoracao){ 
        this.peca = peca;
        this.decoracao = decoracao;
    }

    @Override
    public String toString() {
        return peca.toString();
    }
}