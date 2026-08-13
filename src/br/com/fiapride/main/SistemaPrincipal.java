package br.com.fiapride.main;
import br.com.fiapride.model.Fogao;
public class SistemaPrincipal {

	public static void main(String[] args) {
		Fogao meuFogao= new Fogao();
		meuFogao.tamanho="pequeno";
		meuFogao.embutido=false;
		
		Fogao professorFogao=new Fogao();
		professorFogao.tamanho="grande";
		professorFogao.embutido=true;
		System.out.println("O tamanho do meu fogão é " + meuFogao.tamanho );
		System.out.println("Meu fogão é embutido? " + meuFogao.embutido);
		System.out.println("O tamanho do fogão do professor é " + professorFogao.tamanho );
		System.out.println("O fogão do professor é embutido? " + professorFogao.embutido);
	}

}
