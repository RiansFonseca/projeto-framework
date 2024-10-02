package iterator;
import java.util.Iterator;
import java.util.List;

import observer.Observer;

public class ObserverIterator implements Iterator<Observer> {
    private List<Observer> observadores;
    private int posicaoAtual = 0;

    public ObserverIterator(List<Observer> observadores) {
        this.observadores = observadores;
    }

    @Override
    public boolean hasNext() {
        return posicaoAtual < observadores.size();
    }

    @Override
    public Observer next() {
        if (hasNext()) {
            return observadores.get(posicaoAtual++);
        }
        return null;
    }

    public void notificar(String descricao, Object obj) {
        while (hasNext()) {
            Observer observador = next();
            observador.atualizar(descricao, obj);
        }
    }
}
