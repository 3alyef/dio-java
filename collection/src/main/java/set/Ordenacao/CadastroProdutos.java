package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import main.java.set.Ordenacao.Comparator.ComparatorPreco;
import main.java.set.Ordenacao.Comparator.ComparatorQuantidade;
import main.java.set.Ordenacao.Comparator.ComparatorCode;

public class CadastroProdutos {
	Set<Produto> produtos;
	
	public CadastroProdutos() {
		this.produtos = new HashSet<Produto>();
	}
	
	public void adicionarProduto(int cod, String nome, double preco, int quantidade) {
		this.produtos.add(new Produto(nome, cod, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(produtos);
	}
	
	public Set<Produto> exibirProdutoPorNome() {
		System.out.println("Nome");
		Set<Produto> ordenado = new TreeSet<>(this.produtos);
		return ordenado;
	} 
	
	public Set<Produto> exibirProdutoPorPreco() {
		System.out.println("Preco");
		Set<Produto> ordenado = new TreeSet<>(new ComparatorPreco());
		ordenado.addAll(produtos);
		return ordenado;
	} 
	
	public Set<Produto> exibirProdutoPorQuantidade() {
		System.out.println("Quant");
		Set<Produto> ordenado = new TreeSet<>(new ComparatorQuantidade());
		ordenado.addAll(produtos);
		return ordenado;
	} 
	
	public Set<Produto> exibirProdutoPorCod() {
		System.out.println("Cod");
		Set<Produto> ordenado = new TreeSet<>(new ComparatorCode());
		ordenado.addAll(produtos);
		return ordenado;
	} 
	
	public static void main(String[] args) {
		CadastroProdutos cad = new CadastroProdutos();
		
		cad.exibirProdutos();
		cad.adicionarProduto(12345, "Smart-Phone", 1500, 50);
		cad.adicionarProduto(12355, "Smart-TV", 1750, 25);
		cad.adicionarProduto(12505, "Smart-Watch", 1800, 15);
		cad.exibirProdutos();
		cad.exibirProdutoPorNome();
		cad.exibirProdutos();
		cad.exibirProdutoPorPreco();
		cad.exibirProdutos();
		cad.exibirProdutoPorQuantidade();
		cad.exibirProdutos();
		cad.exibirProdutoPorCod();
		cad.exibirProdutos();
	}
}
