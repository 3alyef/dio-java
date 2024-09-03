package main.java.map.Ordenacao;

public class Evento {
	private String nomeEvento;
	private String nomeAtracao;
	
	@Override
	public String toString() {
		return " | " + nomeEvento + ", " + nomeAtracao + " | \n";
	}

	public Evento(String nomeEvento, String nomeAtracao) {
		this.setNomeEvento(nomeEvento);
		this.setNomeAtracao(nomeAtracao);
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getNomeAtracao() {
		return nomeAtracao;
	}

	public void setNomeAtracao(String nomeAtracao) {
		this.nomeAtracao = nomeAtracao;
	}
}
