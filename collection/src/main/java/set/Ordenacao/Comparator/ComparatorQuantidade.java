package main.java.set.Ordenacao.Comparator;

import java.util.Comparator;

import main.java.set.Ordenacao.Produto;

public class ComparatorQuantidade implements Comparator<Produto> {

	@Override
	public int compare(Produto arg0, Produto arg1) {
		// TODO Auto-generated method stub
		return Integer.compare(arg0.getQuantidade(), arg1.getQuantidade());
	}

}
