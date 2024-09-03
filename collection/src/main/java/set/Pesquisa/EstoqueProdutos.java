package main.java.set.Pesquisa;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class EstoqueProdutos {
	private Map<Long, Produto> produtos;
	
	public EstoqueProdutos() {
		this.produtos = new Hashtable<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		produtos.put(cod, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(produtos);
	}
	
	public void calcularValorTotalEstoque() {
		double valueTotal = 0D;
		
		for(Produto prod : produtos.values()) {
			valueTotal += prod.getQuantidade() * prod.getPreco();
		}
		
		System.out.printf("O valor total no estoque é de: %.2f", valueTotal);
	}
	
	public String obterProdutoMaisCaro() {
		String prodCaro = null;
		Map<Long, Produto> ordProds = new TreeMap<Long, Produto>(produtos);
		prodCaro = ordProds[ordProds.size() - 1];
		return prodCaro;
	}
}
