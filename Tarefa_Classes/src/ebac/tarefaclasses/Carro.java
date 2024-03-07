package ebac.tarefaclasses;

public class Carro {

	private String cor;
	private String modelo;
	private int ano;
	
	

	/**
	 * Método andar que faz o objeto "Carro", como já diz o próprio nome do método, andar. Ao ser acionado, aparece
	 * no console a seguinte mensagem: "Você andou alguns metros com seu carro."
	 */
	public void andar() {
		System.out.println("Você andou alguns metros com seu carro.");
	}
	
	
	
	//=========================//
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
