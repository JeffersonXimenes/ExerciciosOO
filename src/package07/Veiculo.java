package package07;

public class Veiculo {
	private String nome;
	private int rodas;
	private double totalCombustivel;
	private double consumoKm;
	private double quilometragem; 
	private double total;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public double getTotalCombustivel() {
		return totalCombustivel;
	}

	public void setTotalCombustivel(double totalCombustivel) {
		this.totalCombustivel = totalCombustivel;
	}

	public double getConsumoKm() {
		return consumoKm;
	}

	public void setConsumoKm(double consumoKm) {
		this.consumoKm = consumoKm;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public void dadosCarro() {
		System.out.println("Modelo: " + nome);
		System.out.println("Rodas: " + rodas);
		System.out.println("Total Combústivel: " + totalCombustivel);
		System.out.println("Consumo: " + consumoKm);
		System.out.println("Quilometragem: " + quilometragem);
		autonomia(consumoKm, totalCombustivel);		
	}

	public void abastecer(double litros) {	
		if (litros > totalCombustivel) {
			System.out.println("Excedeu capacidade do taque");
		} else {
			totalCombustivel += litros;	
		}
	}
	
	public void trafegar(double distancia, double litros) {
		quilometragem += distancia;
		consumoKm = quilometragem / totalCombustivel; 
	}
	
	public void autonomia(double consumoKm, double totalCombustivel) {
		total = consumoKm * totalCombustivel;
		System.out.println("Total autonomia:" + total);
	}
}
