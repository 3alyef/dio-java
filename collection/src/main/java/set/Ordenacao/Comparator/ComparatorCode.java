package main.java.set.Ordenacao.Comparator;

import java.util.Comparator;

import main.java.set.Ordenacao.Produto;

public class ComparatorCode implements Comparator<Produto> {

	@Override
	public int compare(Produto arg0, Produto arg1) {
		// TODO Auto-generated method stub
		return Long.compare(arg0.getCod(), arg1.getCod());
	}
	
}
