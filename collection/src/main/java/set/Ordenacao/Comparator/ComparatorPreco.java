package main.java.set.Ordenacao.Comparator;

import java.util.Comparator;

import main.java.set.Ordenacao.Produto;

public class ComparatorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto arg0, Produto arg1) {
		// TODO Auto-generated method stub
		return Double.compare(arg0.getPreco(), arg1.getPreco());
	}

}
