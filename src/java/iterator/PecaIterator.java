package iterator;
import java.util.Iterator;
import java.util.List;

import model.Peca;

public class PecaIterator implements Iterator<Peca> {
    private List<Peca> pecas;
    private int posicaoAtual = 0;

    public PecaIterator(List<Peca> pecas) {
        this.pecas = pecas;
    }

    @Override
    public boolean hasNext() {
        return posicaoAtual < pecas.size();
    }

    @Override
    public Peca next() {
        if (hasNext()) {
            return pecas.get(posicaoAtual++);
        }
        return null;
    }
}
