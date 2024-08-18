package collections.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> notas2 = new ArrayList<Double>(Arrays.asList(2d, 3d, 4.5, 7.5));
		System.out.println(notas2.toString());
		System.out.println(notas2.get(0));
		notas2.remove(0);
		System.out.println(notas2.toString());
	}

}
