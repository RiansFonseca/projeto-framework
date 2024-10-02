package observer;

public interface EventosDeUI {
    public void adicionarObservadores(Observer observer);
    public void removerObservadores(Observer observer);
    public void notificarObservadores(String descricao, Object obj);
}
