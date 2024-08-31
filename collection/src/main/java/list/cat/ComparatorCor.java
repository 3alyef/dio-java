package main.java.list.cat;

import java.util.Comparator;

public class ComparatorCor implements Comparator<Cat> {
	@Override
	public int compare(Cat cat1, Cat cat2) {
		return cat1.getCor().compareToIgnoreCase(cat2.getCor());
	}
}
