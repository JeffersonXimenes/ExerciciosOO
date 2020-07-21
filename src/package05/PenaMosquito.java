package package05;

public class PenaMosquito {
	private String ehFeitoDe;
	private String escreveCom;
	
	public PenaMosquito() {
		this.ehFeitoDe = "Metal";
		this.escreveCom = "Nanquim";
		escrever();
	}
	
	public void escrever() {
		System.out.println("Material: " + ehFeitoDe + " escrevendo com: " + this.escreveCom);
	}
}
