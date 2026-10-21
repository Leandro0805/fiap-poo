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
	
	
	
}
