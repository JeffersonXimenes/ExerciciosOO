package package02;

public class Exercicio02 {
	double base;
	double altura;
	double area;
	
	public Exercicio02(double base, double altura) {
		this.base = base;
		this.altura = altura;
		calculo(base, altura);
	} 
	
	
	public void calculo(double base, double altura) {
		area = (base * altura) / 2;	
		System.out.println("O cálculo é: " + area);
	}
	
	
	
	
}
