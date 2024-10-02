package model;

public class PecaBranca extends Peca {

    public PecaBranca(String tipo) {
        super(tipo, determinarCor(tipo));
    }

    private static String determinarCor(String tipo) {
        if (tipo.equalsIgnoreCase("rainha") || tipo.equalsIgnoreCase("torre")) {
            return "Branca";
        }
        return "Branco";
    }

    @Override
    public String toString() {
        return super.toString(); // Reutiliza o toString da classe base
    }
}
