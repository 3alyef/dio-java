package heranca_polimorfismo;

public class Run {
	public static void main(String args[]) {
		ClasseMae[] classes = new ClasseMae[] { 
			new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()
		};
		
		for(ClasseMae classe: classes) {
			classe.method1();
		}
		
	}
}
