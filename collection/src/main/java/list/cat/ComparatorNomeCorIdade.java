package main.java.list.cat;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Cat>{

	@Override
	public int compare(Cat cat1, Cat cat2) {
		int comp = cat1.getNome().compareToIgnoreCase(cat2.getNome());
//		if(comp == 0) {
//			int comp2 = cat1.getCor().compareToIgnoreCase(cat2.getCor());
//			if(comp2 == 0) {
//				return Integer.compare(cat1.getIdade(), cat2.getIdade());		
//			} else {
//				return comp2;
//			}
//		} else {
//			return comp;
//		}
		
		if(comp != 0) return comp;
		
		int comp2 = cat1.getCor().compareToIgnoreCase(cat2.getCor());
		if(comp2 != 0) return comp2;
		
		return Integer.compare(cat1.getIdade(), cat2.getIdade());	
	}
}
