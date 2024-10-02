package model;

public class PecaPreta extends Peca {

    public PecaPreta(String tipo) {
        super(tipo, determinarCor(tipo));
    }

    private static String determinarCor(String tipo) {
        if (tipo.equalsIgnoreCase("rainha") || tipo.equalsIgnoreCase("torre")) {
            return "Preta";
        }
        return "Preto"; // Para todos os outros tipos
    }

    @Override
    public String toString() {
        return super.toString(); // Reutiliza o toString da classe base
    }
}
