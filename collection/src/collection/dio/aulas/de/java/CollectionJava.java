package collection.dio.aulas.de.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collection.dio.aulas.de.java.cat.Cat;

public class CollectionJava {

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
		
	}

}
