package heranca_2;

public abstract class Funcionario {
	private String name;
	private double salario;
	
	public Funcionario(String name, double salario) {
		this.setName(name);
		this.setSalario(salario);
	}
	
	protected String getAbout() {
		String about = "\nNome: "+this.name+"\nSalário: "+this.salario;
		
		return about;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}
}
