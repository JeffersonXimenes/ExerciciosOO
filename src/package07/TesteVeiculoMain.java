package package07;

public class TesteVeiculoMain {

	public static void main(String[] args) {
		Veiculo carro = new Veiculo();
		
		carro.setNome("Uno");
		carro.setRodas(4);
		carro.setTotalCombustivel(50);
		carro.setConsumoKm(8);
		carro.autonomia(8, 50);
		
		carro.dadosCarro();
	}

}
