package client;

import factory.JogoDamasFactory;
import factory.JogoFactory;
import factory.JogoXadrezFactory;
import model.Jogo;

public class Cliente {
<<<<<<< HEAD
    public static void main(String[] args) {
        // Usando a fábrica para criar um jogo de Xadrez
        JogoFactory factory = new JogoXadrezFactory();
        Jogo jogo = factory.criarJogo();
        System.out.println(jogo);

        // Usando a fábrica para criar um jogo de Damas
        factory = new JogoDamasFactory();
        jogo = factory.criarJogo();
        System.out.println(jogo);
    }
=======
	private static boolean tempoEsgotado = false;

	public static void main(String[] args) {
		int i = 0;
		// Instancia o Facade
		JogoFacade jogoFacade = new JogoFacade();

		// Inicia uma partida de Damas
		jogoFacade.iniciarPartidaDamas();

		// Cria uma thread para controlar o tempo de 30 segundos (30.000 ms)
		new Thread(() -> {
			try {
				Thread.sleep(5000);
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

		// Após o tempo esgotado, imprime o estado do jogo em JSON
		System.out.println(jogoFacade.obterJogo());
	}
>>>>>>> 9e20a14 (Adapter)
}
