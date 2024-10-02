package logger;

import java.util.ArrayList;
import java.util.List;

import facade.JogoFacade;
import observer.Observer;

public class JogoLogger extends Observer {
    private List<String> logs;

    public JogoLogger(JogoFacade jogoFacade) {
        this.logs = new ArrayList<>();
        jogoFacade.adicionarObservadores(this);
    }

    @Override
    public void atualizar(String descricao, Object obj ) {
        String log = "LOG: " + descricao + " "+ obj;
        logs.add(log);
        System.out.println(log);
    }

    // Método para mostrar todos os logs
    public void mostrarLogs() {
        System.out.println("LOGS DO JOGO:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
