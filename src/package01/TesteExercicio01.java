package package01;

public class TesteExercicio01 {

	public static void main(String[] args) {
		Exercicio01 c1 = new Exercicio01();
		c1.carga = 90;
		c1.tampada = true; // CANETA TAMPADA 
		c1.status();
		c1.rabiscar();
		
		c1.tampada = false; // AGORA PODE RABISCAR, DESTAMPEI
		c1.rabiscar();
	}

}
