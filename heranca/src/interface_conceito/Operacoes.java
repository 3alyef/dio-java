package interface_conceito;

class Operacoes implements OperacaoMatematica {
	
	@Override
	public double soma(double num1, double num2) {	
		return num1 + num2;
	}
	
	@Override
	public double divisao(double num1, double num2) {
		return num1 / num2;
	}
	
	@Override
	public double multiplicacao(double num1, double num2) {
		return num1 * num2;
	}
	
	@Override
	public double subtracao(double num1, double num2) {
		return num1 - num2;
	}
}
