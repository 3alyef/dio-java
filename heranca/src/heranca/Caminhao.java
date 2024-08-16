package heranca;

public class Caminhao extends Veiculo {
	private int portas;
	
	public Caminhao(String modelo, int portas) {
		super(modelo, portas);
	}
	protected int getPortas() {
		return portas;
	}
	protected void setPortas(int portas) {
		this.portas = portas;
	}
}
