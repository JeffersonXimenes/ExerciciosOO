package package04;

public class Funcionario extends Pessoa{
	private int numeroMatricula;
	
	
	// GET NUMEROMATRICULA 
	public int getNumeroMatricula() {
		System.out.println("N� Matr�cula: " + this.numeroMatricula);
		return this.numeroMatricula;
	}
	
	// SET NUMEROMATRICULA 
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public void exibirDados() {
		System.out.println("N� Matr�cula: " + this.numeroMatricula);

	}
}
