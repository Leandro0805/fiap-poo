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
		
	
	//Função adaptada à classe FogaoInducao
	@Override
	public void prepararParaUso() {
	    System.out.println("Fogão a gás: verificando o fornecimento de gás.");
	}
	
	//sobrescrevendo a classe abstrata de Fogao
	@Override
	public void tipoEnergia() {
		System.out.println("Esse fogão é abastecido tanto por GLP (gás liquefeito de petróleo) como por GN (gás natural). Por favor, alimente-o a uma dessas opções ");
		}
}
