package heranca_2;

public class RunTest {

	public static void main(String[] args) {
		
		// upcast
		Funcionario fax1 = new Faxineiro("Kaleb", 1250.17);
		
		// downcast
		// Vendedor vend1 = (Vendedor) new Funcionario("Yakov", 1500.57);
		
		Funcionario vend1 = new Vendedor("Yakov", 1500.57);
		Gerente gerente = new Gerente("Ibrahim", 2500);
		
		System.out.println("Faxineiro: " + fax1.getAbout());
		System.out.println("Vendedor: " + vend1.getAbout());
		System.out.println("Gerente: " + gerente.getAbout());
	}

}
