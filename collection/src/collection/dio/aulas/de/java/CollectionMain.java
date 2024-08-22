package collection.dio.aulas.de.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collection.dio.aulas.de.java.cat.Cat;
import collection.dio.aulas.de.java.cat.ComparatorIdade;
import collection.dio.aulas.de.java.cat.ComparatorCor;
import collection.dio.aulas.de.java.cat.ComparatorNomeCorIdade;
public class CollectionMain {

	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<Cat>() {{
			add(new Cat("Jon", 18, "preto"));
			add(new Cat("Simba", 6, "tigrado"));
			add(new Cat("Jon", 12, "amarelo"));
		}};
		System.out.println("Ordem de Inserção");
		System.out.println(cats);
		
		System.out.println("Ordem aleátoria");
		Collections.shuffle(cats);
		System.out.println(cats);
		
		System.out.println("Ordem Natural <--Nome-->");
		Collections.sort(cats);
		System.out.println(cats);
		
		System.out.println("--\tOrdem Idade\t---");
		// Collectios.sort(cats, new ComparatorIdade());
		cats.sort(new ComparatorIdade());
		System.out.println(cats);
		
		System.out.println("--\tOrdem Cor\t---");
		cats.sort(new ComparatorCor());
		System.out.println(cats);
		
		System.out.println("--\t Ordem Nome/Cor/Idade\t---");
		cats.sort(new ComparatorNomeCorIdade());
		System.out.println(cats);
		
	}

}
