package adapter;

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

		return gson.toJson(jogo.toString());
	}

}
