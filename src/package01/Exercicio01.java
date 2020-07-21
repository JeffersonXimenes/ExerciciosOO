package package01;

public class Exercicio01 {
	public String modelo;
	public String cor;
	private float ponta;
	protected  int carga;
	protected boolean tampada;
	 
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Está tampada: " + this.tampada);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
	}
	
	// GET MODELO
	public String getModelo() {
		return this.modelo;
	}
	
	// SET MODELO
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	// GET PONTA 
	public float getPonta() {
		return this.ponta;
	}
	
	// SET PONTA
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	
	// VERIFICAÇÃO SE PODE RABISCAR 
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Não posso rabiscar! pois a caneta está tampada");
		} else {
			System.out.println("Estou rabiscando até a parede!");
		}
	}
	
	// TAMPADA > VERDADEIRO 
	public void tampar() {
		this.tampada = true;
	}
	
	// TAMPADA > FALSA 
	public void destampar() {
		this.tampada = false;
	}
}


