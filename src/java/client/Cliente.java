package client;

import facade.JogoFacade;
import logger.JogoLogger;

public class Cliente {
	private static boolean tempoEsgotado = false;

	public static void main(String[] args) {
		int i = 0;
		// Instancia o Facade
		JogoFacade jogoFacade = new JogoFacade();
		JogoLogger jogoLogger = new JogoLogger(jogoFacade);
		jogoFacade.iniciarJogoXadrez();

		// Cria uma thread para controlar o tempo de 30 segundos (30.000 ms)
		new Thread(() -> {
			try {
				Thread.sleep(5000);
				tempoEsgotado = true;
				jogoFacade.terminarJogoXadrez();
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
		jogoFacade.getJogoJson();
	}
}
