package decorators;
public class AdornosVermelhosDecorator extends PecaDecorator {

    public AdornosVermelhosDecorator(String pecaDecorada) {
        super(pecaDecorada);
    }

    @Override
    public String toString() {
        return super.renderiza() + " Com Adornos Vermelhos";
    }
}
