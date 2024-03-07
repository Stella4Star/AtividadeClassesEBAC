package ebac.tarefaclasses;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setModelo("Palio");
		carro.setAno(2006);
		carro.setCor("Prata");

		carro.andar();
		
	}

}
