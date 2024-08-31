package main.java.set.Ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
	private String nome;
	private long cod;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, long cod, double preco, int quantidade) {
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public long getCod() {
		return cod;
	}
	
	@Override
	public int compareTo(Produto o) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(o.getNome());
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	@Override
	public String toString() {
		return "\n{" + nome + ", " + cod + ", " + preco + ", " + quantidade + "}\n";
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quatidade) {
		this.quantidade = quatidade;
	}

	
	
	
}
