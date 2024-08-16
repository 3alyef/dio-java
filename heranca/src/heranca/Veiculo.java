package heranca;

public abstract class Veiculo {
	private float velocidade;
	private String modelo;
	private boolean ligado;
	private int rodas;
	
	public Veiculo(String modelo, int rodas) {
		this.setVelocidade(0);
		this.setModelo(modelo);
		this.setRodas(rodas);
	}
	
	protected float getVelocidade() {
		return velocidade;
	}
	
	protected void setVelocidade(float vel) {
		this.velocidade += vel;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected boolean isLigado() {
		return ligado;
	}

	protected void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	protected int getRodas() {
		return rodas;
	}

	protected void setRodas(int rodas) {
		this.rodas = rodas;
	}
}
