package package03;

public class Livro {
	private String titulo;
	private String autor;
	private int paginasLivro;

	
	// CONSTRUTOR
	public Livro(String titulo, String autor, int paginasLivro) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginasLivro = paginasLivro;
		dadosLivro();
	}
	
	// GET TITULO
	public String getTitulo() {
		return this.titulo;
	}
	
	// GET AUTOR
	public String getAutor() {
		return this.autor;
	}
	
	// GET PAGINASLIVRO
	public int getPaginasLivro() {
		return this.paginasLivro;
	}
	
	public void dadosLivro() {
		System.out.println("T�tulo: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		System.out.println("Total de P�ginas: "+this.paginasLivro);
	}
}
