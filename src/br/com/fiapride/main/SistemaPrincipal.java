package br.com.fiapride.main;

import br.com.fiapride.model.Fogao;
import br.com.fiapride.model.Proprietario;

public class SistemaPrincipal {

    public static void main(String[] args) {
        
        System.out.println("=== TESTE 1: Caminho Válido ===");
        Proprietario leandro = new Proprietario("Leandro");
        Fogao meuFogao = new Fogao(leandro, "Pequeno", 4);
        
        System.out.println("Proprietário: " + meuFogao.getProprietario().getNome());
        System.out.println("Tamanho: " + meuFogao.getTamanho());
        System.out.println("Quantidade de bocas: " + meuFogao.getQuantidadeBocas());
        
        // Teste de uso do fogão
        meuFogao.ligarBocas(2); // Deve recusar pois está desligado
        meuFogao.ligarFogao();  // Liga
        meuFogao.ligarBocas(2); // Acende 2 bocas
        System.out.println("Bocas acesas atualmente: " + meuFogao.getBocasAcesas());
        
        System.out.println("\n=== TESTE 2: Validações de Erro e Regras de Negócio ===");
        // Teste de criação com dados inválidos (construtores devem barrar)
        Proprietario invalido = new Proprietario("");
        Fogao fogaoInvalido = new Fogao(null, "", -2);
        
        System.out.println("\n=== TESTE 3: Fogão do Professor ===");
        Proprietario igor = new Proprietario("Igor");
        Fogao fogaoProfessor = new Fogao(igor, "Grande", 6);
        
        System.out.println("Proprietário do fogão do professor: " + fogaoProfessor.getProprietario().getNome());
        System.out.println("Bocas: " + fogaoProfessor.getQuantidadeBocas());
    }
}