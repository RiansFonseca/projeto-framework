package decorators;
public class AdornosVermelhosDecorator extends PecaDecorator {

<<<<<<< HEAD
    public AdornosVermelhosDecorator(Peca peca) {
        super(peca);
=======
    public AdornosVermelhosDecorator(String pecaDecorada) {
        super(pecaDecorada);
>>>>>>> 9e20a14 (Adapter)
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return super.toString() + " com adornos vermelhos";
=======
        return super.renderiza() + " Com Adornos Vermelhos";
>>>>>>> 9e20a14 (Adapter)
    }
}

