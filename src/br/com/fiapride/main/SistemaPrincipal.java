package br.com.fiapride.main;

import br.com.fiapride.model.Fogao;

public class SistemaPrincipal {

public static void main(String[] args) {
	
	//Definição do objeto e dos seus atributos
	Fogao meuFogao = new Fogao();

	meuFogao.setTamanho("pequeno");
	meuFogao.setLigado(false);
	meuFogao.setQuantidade_bocas(4);
	
	//Teste dos atributos 
	System.out.println("O tamanho do meu fogão é " + meuFogao.getTamanho());
	System.out.println("Meu fogão está ligado? " + meuFogao.isLigado());

	//Testando as função ligar_fogao
	
	// Teste válido: ligar o fogão
	meuFogao.ligar_fogao();

	// Teste inválido: tentar ligar novamente
	meuFogao.ligar_fogao();

	
	//Testando a função ligar_bocas
	// Teste válido: acender 2 bocas
	meuFogao.ligar_bocas(2);

	// Teste inválido: o fogão possui apenas 4 bocas
	meuFogao.ligar_bocas(5);

	// Teste inválido: quantidade menor ou igual a zero
	meuFogao.ligar_bocas(0);

	//Quantidade de bocas acesas
	System.out.println("Bocas acesas: " + meuFogao.getBocas_acesas());
	
	//Objeto professorFogao
	Fogao professorFogao = new Fogao();

	professorFogao.setTamanho("grande");
	professorFogao.setLigado(true);
	professorFogao.setQuantidade_bocas(6);

	System.out.println("O tamanho do fogão do professor é "
			+ professorFogao.getTamanho());

	System.out.println("O fogão do professor está ligado? "
			+ professorFogao.isLigado());
}


}