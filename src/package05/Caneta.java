package package05;

public class Caneta {
	private String ehFeitoDe;
	private String escreveCom;
	
	// BOB CONSTRUTOR 
	public Caneta() {
		this.ehFeitoDe = "Plástico";
		this.escreveCom = "Tinta";
		escrever();
	}
	
	
	public void escrever() {
		System.out.println("Material: " + ehFeitoDe + " escrevendo com: " + this.escreveCom);
	}
}
