package collection.dio.aulas.de.java.cat;

public class Cat implements Comparable<Cat> {
	private String nome;
	private int idade;
	private String cor;
	
	public Cat(String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	@Override
	public int compareTo(Cat cat) {
		return this.getNome().compareToIgnoreCase(cat.getNome());
	}

	@Override
	public String toString() {
		return "[nome=" + nome + 
				", idade=" + idade + 
				", cor=" + cor + "]";
	}
	
	
}
