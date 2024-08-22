package collection.dio.aulas.de.java.cat;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<Cat> {
	@Override
	public int compare(Cat cat1, Cat cat2) {
		return Integer.compare(cat1.getIdade(), cat2.getIdade());
	}
}
