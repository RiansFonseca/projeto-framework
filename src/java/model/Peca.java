package model;

// Peça
public class Peca {
    private String nome;
    private String corPeca;

    public Peca(String nome, String corPeca) {
        this.nome = nome;
        this.corPeca = corPeca;
    }

<<<<<<< HEAD
    public Peca(String nome) { this.nome = nome; }
=======
    public Peca(String nome, String corPeca) {
        this.nome = nome;
        this.corPeca = corPeca;
    }

    public Peca(String nome) {
        this.nome = nome;
    }
>>>>>>> 9e20a14 (Adapter)

    public String getNome(){
        return nome;
    }

    public String getCor(){
        return corPeca;
    }

    public String renderiza(){
        return nome + " " + corPeca;
    }
    
    @Override
    public String toString() {
<<<<<<< HEAD
        return nome;
=======
        return renderiza();
>>>>>>> 9e20a14 (Adapter)
    }

    
}
