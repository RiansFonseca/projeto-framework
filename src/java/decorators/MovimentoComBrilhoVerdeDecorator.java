package decorators;
public class MovimentoComBrilhoVerdeDecorator extends PecaDecorator {
<<<<<<< HEAD
    
    public MovimentoComBrilhoVerdeDecorator(Peca peca) {
        super(peca);
=======

    public MovimentoComBrilhoVerdeDecorator(String pecaDecorada) {
        super(pecaDecorada);
>>>>>>> 9e20a14 (Adapter)
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return super.toString() + " com brilho verde no movimento";
=======
        return super.renderiza() + " Movimento com Brilho Verde";
>>>>>>> 9e20a14 (Adapter)
    }
}