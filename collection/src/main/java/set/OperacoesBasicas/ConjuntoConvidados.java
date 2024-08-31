package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadosSet;
	
	public ConjuntoConvidados() {
		this.convidadosSet = new HashSet<Convidado>();
	}
	
	public void addConvidado(String nome, int codigoConvite) {
		this.convidadosSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removeConvidadoPeloCodigoConvite(int codigoConvite) {
		Convidado convidadoRemove = null;
		for(Convidado c: this.convidadosSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoRemove = c;
				break;
			}
		}
		
		if(convidadoRemove != null) {
			this.convidadosSet.remove(convidadoRemove);
		}
	}
	
	public int contarConvidados() {
		return this.convidadosSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(this.convidadosSet);
	}
}
