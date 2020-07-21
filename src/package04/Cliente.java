package package04;

public class Cliente extends Pessoa {
	private String cpf;
	
	
	// GET CPF
	public String getCpf() {
		System.out.println("CPF: " + this.cpf);
		return this.cpf;
	}
	
	// SET CPF
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void exibirDados() {
		System.out.println("CPF: " + this.cpf);

	}
}
