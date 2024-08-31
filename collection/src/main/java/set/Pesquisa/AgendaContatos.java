package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatosSet;
	
	
	
	public AgendaContatos() {
		this.contatosSet = new HashSet<Contato>();
	}
	
	public void adicionarContato(String nome, int numeroContato) {
		this.contatosSet.add(new Contato(nome, numeroContato));
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosCorresp = new HashSet<Contato>();
		
		for(Contato c: this.contatosSet) {
			if(c.getNome().startsWith(nome)) {
				contatosCorresp.add(c);
			}
		}
		
		return contatosCorresp;
	}
	
	public void atualizarNumeroContato(String nome, int novoNumero) {
		
		for(Contato c: this.contatosSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumeroTelefone(novoNumero);
				break;
			}
		}
		
	}
	
	public void exibirContatos() {
		System.out.println(this.contatosSet);
	}
	
	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.exibirContatos();
		
		agenda.adicionarContato("Alef", 40028922);
		agenda.adicionarContato("Sarah", 972555815);
		agenda.adicionarContato("Sarah Cohen", 9725550);
		agenda.adicionarContato("Sarah", 972553350);
		agenda.adicionarContato("Betar", 9725580);
		agenda.adicionarContato("Ahmed", 97255358);
		agenda.adicionarContato("Miriam", 9725840);
		
		agenda.exibirContatos();
	}
}
