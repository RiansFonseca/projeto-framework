package adapter;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Jogo;

public class JogoJsonAdapter implements JogoAdapter {
	private Jogo jogo;

	public JogoJsonAdapter(Jogo jogo) {
		this.jogo = jogo;
	}

	@Override
	public String convert() {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		Gson gson = gsonBuilder.create();
	
		Map<String, Object> jogoData = new HashMap<>();
	
		// Adicionando peças brancas
		jogoData.put("PEÇAS BRANCAS", jogo.getPecasBrancas());
	
		// Adicionando peças pretas
		jogoData.put("PEÇAS PRETAS", jogo.getPecasPretas());
	
		// Adicionando regras do jogo
		jogoData.put("REGRAS", jogo.getRegras());
	
		// Adicionando informações do tabuleiro
		jogoData.put("TABULEIRO", "TAMANHO: " + jogo.getTabuleiro().getTamanho());
	
		// Retornando o JSON formatado
		return gson.toJson(jogoData);
	}

	@Override
	public String toString(){
		return convert();
	}
}
