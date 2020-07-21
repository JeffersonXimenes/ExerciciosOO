package package05;

public class Lapis {
	private String ehFeitoDe;
	private String escreveCom;
	
	public Lapis() {
		this.ehFeitoDe = "Madeira";
		this.escreveCom = "Grafite";
		escrever();
	}
	
	public void escrever() {
		System.out.println("Material: " + ehFeitoDe + " escrevendo com: " + this.escreveCom);
	}
}
