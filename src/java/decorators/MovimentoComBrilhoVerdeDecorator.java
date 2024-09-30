package decorators;
public class MovimentoComBrilhoVerdeDecorator extends PecaDecorator {

    public MovimentoComBrilhoVerdeDecorator(String pecaDecorada) {
        super(pecaDecorada);
    }

    @Override
    public String toString() {
        return super.renderiza() + " Movimento com Brilho Verde";
    }
}