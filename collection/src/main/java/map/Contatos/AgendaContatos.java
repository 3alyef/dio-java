package main.java.map.Contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> contatos;
	
	public static void main(String[] args) {
		AgendaContatos cont = new AgendaContatos();
		
		cont.adicionarContato("Alef", 40028922);
		cont.adicionarContato("Avraham", 9725445);
		cont.adicionarContato("Sarah", 97200154);
		cont.adicionarContato("Itskhaq", 972545848);
		cont.adicionarContato("Ikhesquiel", 972548);
		cont.adicionarContato("Naama", 9726334);
		cont.exibirContatos();
		cont.removerContato("Alef");
		cont.print(cont.pesquisarPorNome("Naama"));
		cont.exibirContatos();
	}
	
	public AgendaContatos() {
		this.contatos = new HashMap<>();
	}
	
	public void adicionarContato(String nome, int telefone) {
		contatos.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!contatos.isEmpty()) {
			contatos.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(contatos);
	}
	
	public Integer pesquisarPorNome(String nome) {
		return contatos.get(nome);
	}
	
	 public <T> void print(T content) {
        System.out.println(content);
    }
}
