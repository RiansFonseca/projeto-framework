package client;

import facade.JogoFacade;

// Cliente
public class Cliente {
    private static boolean tempoEsgotado = false;

    public static void main(String[] args) {
        int i = 0;
        // Instancia o Facade
        JogoFacade jogoFacade = new JogoFacade();

        // Inicia uma partida de Xadrez
        jogoFacade.iniciarPartidaXadrez();

        // Cria uma thread para controlar o tempo de 30 segundos (30.000 ms)
        new Thread(() -> {
            try {
                Thread.sleep(30000);
                tempoEsgotado = true;
                jogoFacade.terminarPartidaXadrez();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Simula o jogo rodando enquanto o tempo está correndo (contagem de números)
        while (!tempoEsgotado) {
            System.out.println("JOGO RODANDO: " + i++);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre as contagens
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
