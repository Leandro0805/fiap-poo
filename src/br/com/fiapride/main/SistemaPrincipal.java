package br.com.fiapride.main;

import br.com.fiapride.model.Fogao;

public class SistemaPrincipal {

	public static void main(String[] args) {

		Fogao meuFogao = new Fogao();

		meuFogao.tamanho = "pequeno";
		meuFogao.ligado = false;
		meuFogao.quantidade_bocas = 4;

		System.out.println("O tamanho do meu fogão é " + meuFogao.tamanho);
		System.out.println("Meu fogão está ligado? " + meuFogao.ligado);

		// Teste válido: ligar o fogão
		meuFogao.ligar_fogao();

		// Teste inválido: tentar ligar novamente
		meuFogao.ligar_fogao();

		// Teste válido: acender 2 bocas
		meuFogao.ligar_bocas(2);

		// Teste inválido: o fogão possui apenas 4 bocas
		meuFogao.ligar_bocas(5);

		// Teste inválido: quantidade menor ou igual a zero
		meuFogao.ligar_bocas(0);

		System.out.println("Bocas acesas: " + meuFogao.bocas_acesas);

		Fogao professorFogao = new Fogao();

		professorFogao.tamanho = "grande";
		professorFogao.ligado = true;
		professorFogao.quantidade_bocas = 6;

		System.out.println("O tamanho do fogão do professor é "
				+ professorFogao.tamanho);
		System.out.println("O fogão do professor está ligado? "
				+ professorFogao.ligado);
	}
}