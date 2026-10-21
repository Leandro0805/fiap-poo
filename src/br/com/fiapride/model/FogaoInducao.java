package br.com.fiapride.model;

public class FogaoInducao extends Fogao {
	private float potenciaMaxima;
	public FogaoInducao(Proprietario proprietario, String tamanho, int quantidadeBocas) {
		super(proprietario,tamanho,quantidadeBocas);
	}
	
	//definição do setter de potenciaMaxima
	public void setPotenciaMaxima (float potenciaMaxima) {
		this.potenciaMaxima=potenciaMaxima;
	}
	
	//definição do getter de potenciaMaxima
	public float getPotenciaMaxima() {
		return potenciaMaxima;
	}
	
	//Função adaptada à classe FogaoInducao
	@Override
	public void prepararParaUso() {
	    System.out.println("Fogão de indução: verificando se a panela é compatível.");
	}
	
	//sobrescrevendo a classe abstrata de Fogao
	@Override
	public void tipoEnergia() {
		System.out.println("Esse fogão é abastecido por energia elétrica. Por favor, conecte-o a rede elétrica");
	}
	
	
}
