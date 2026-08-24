package br.com.fiapride.model;

public class Fogao {

	public String tamanho;
	public boolean ligado;
	public int quantidade_bocas;
	public int bocas_acesas;

	public void ligar_fogao() {
		if (ligado) {
			System.out.println("O seu fogão já está ligado!");
		} else {
			ligado = true;
			System.out.println("Fogão ligado!");
		}
	}

	public void ligar_bocas(int bocas_acessas) {
		if (!ligado) {
			System.out.println("Não é possível acender as bocas com o fogão desligado!");
		} else if (bocas_acessas <= 0 || bocas_acessas > quantidade_bocas) {
			System.out.println("Quantidade de bocas inválida!");
		} else {
			this.bocas_acesas = bocas_acessas;
			System.out.println("Foram acendidas " + bocas_acessas + " bocas.");
		}
	}
}