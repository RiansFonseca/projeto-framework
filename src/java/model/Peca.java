package model;

public class Peca implements Cloneable {
    private String tipo;
    private String corPeca;

    public Peca(String tipo, String corPeca) {
        this.tipo = tipo;
        this.corPeca = corPeca;
    }

    public Peca() {}

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return corPeca;
    }

    public void setCor(String corPeca) {
        this.corPeca = corPeca;
    }

    @Override
    public String toString() {
        return "-> " + tipo + " " + corPeca;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Chama o método clone da superclasse (Object)
        return super.clone();
    }
}

