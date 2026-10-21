package br.com.fiapride.model;

public class FogaoGas extends Fogao {
	private String tipoGas;
	public FogaoGas(Proprietario proprietario, String tamanho, int quantidadeBocas) {
		super(proprietario,tamanho,quantidadeBocas);	
	}
	//definição do setter de tipoGas
	public void setTipoGas (String tipoGas) {
			this.tipoGas=tipoGas;
		}
		
	//definição do getter de potenciaMaxima
	public String getTipoGas() {
			return tipoGas;
		}
		
		
		
	
}
