package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
	private String nome;
	private int numeroTelefone;
	
	public Contato(String nome, int numeroTelefone) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "{" + nome + ", " + numeroTelefone + "}";
	}

	public int getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
}
