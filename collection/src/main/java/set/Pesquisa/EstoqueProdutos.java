package main.java.set.Pesquisa;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class EstoqueProdutos {
	private Map<Long, Produto> produtos;
	
	public static void main(String[] args) {
		EstoqueProdutos estProd = new EstoqueProdutos();
		
		estProd.adicionarProduto(415477, "Smart watch", 35, 1500);
		estProd.adicionarProduto(413277, "Smart tv 15''", 28, 1750);
		estProd.adicionarProduto(413285, "Smart tv 20''", 30, 1800);
		estProd.calcularValorTotalEstoque();
		estProd.obterProdutoMaisCaro();
		estProd.obterProdutoMaisBarato();
		estProd.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
	}
	
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
		if(!produtos.isEmpty()) {
			for(Produto prod : produtos.values()) {
				valueTotal += prod.getQuantidade() * prod.getPreco();
			}
		}
		System.out.printf("O valor total no estoque é de: %.2f", valueTotal);
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto prevProduto = null;
		for(Produto prod : produtos.values()) {
			if(prevProduto == null || prod.getPreco() > prevProduto.getPreco()) {
				prevProduto = prod;
			}
		}	
		System.out.println(prevProduto);
		return prevProduto;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto prevProduto = null;
		for(Produto prod : produtos.values()) {
			if(prevProduto == null || prod.getPreco() < prevProduto.getPreco()) {
				prevProduto = prod;
			}
		}
		System.out.println(prevProduto);
		return prevProduto;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		// valor total de cada produto == quantidade * preco
		Produto prevProduto = null;
		for(Produto prod : produtos.values()) {
			double valueSPrev = Double.MIN_VALUE;
			if(prevProduto != null) valueSPrev =  prevProduto.getPreco() * prevProduto.getQuantidade();
			double valueSProd = prod.getPreco() * prod.getQuantidade();
			
			if(prevProduto == null || valueSProd > valueSPrev) {
				prevProduto = prod;
			}
		}
		
		System.out.println(prevProduto);
		return prevProduto;
	}
}
