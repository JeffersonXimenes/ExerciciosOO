package package04;

public class Pessoa {
	private String nome;
	private String cidadeNascimento;
	private int idade;
	
	
	// GET NOME
	public String getNome() {
		System.out.println("Nome: " + this.nome);
		return this.nome;
	}
	
	// SET NOME
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	// GET CIDADENASCIMENTO 
	public String getCidadeNascimento() {
		System.out.println("Cidade Nascimento: "+ this.cidadeNascimento);
		return this.cidadeNascimento;
	}
	
	// SET CIDADENASCIMENTO 
	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}
	
	// GET IDADE 
	public int getIdade() {
		System.out.println("Idade: " +this.idade);
		return this.idade;
	}
	
	// SET IDADE 
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.cidadeNascimento);
		System.out.println("Idade: " + this.idade);
	}

}
