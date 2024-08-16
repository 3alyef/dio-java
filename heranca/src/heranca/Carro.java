package heranca;

public class Carro extends Veiculo {
	private int portas;
	
	public Carro(String modelo, int rodas) {
		super(modelo, rodas);
	}

	protected int getPortas() {
		return portas;
	}

	protected void setPortas(int portas) {
		this.portas = portas;
	}
}
