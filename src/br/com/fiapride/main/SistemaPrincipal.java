
package br.com.fiapride.main;

import br.com.fiapride.model.Fogao;
import br.com.fiapride.model.FogaoGas;
import br.com.fiapride.model.FogaoInducao;
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

        // Teste de criação com dados inválidos
        Proprietario invalido = new Proprietario("");
        Fogao fogaoInvalido = new Fogao(null, "", -2);

        System.out.println("\n=== TESTE 3: Fogão do Professor ===");
        Proprietario igor = new Proprietario("Igor");
        Fogao fogaoProfessor = new Fogao(igor, "Grande", 6);

        System.out.println("Proprietário do fogão do professor: "
                + fogaoProfessor.getProprietario().getNome());
        System.out.println("Bocas: " + fogaoProfessor.getQuantidadeBocas());

        System.out.println("\n=== TESTE 4: Classe Filha FogaoInducao ===");

        // Criação do proprietário e do fogão de indução
        Proprietario proprietarioInducao = new Proprietario("Maria");
        FogaoInducao fogaoInducao =
                new FogaoInducao(proprietarioInducao, "Médio", 4);

        // Definição do atributo exclusivo da classe filha
        fogaoInducao.setPotenciaMaxima(7000.0f);

        // Exibição dos atributos herdados e exclusivos
        System.out.println("Proprietário: "
                + fogaoInducao.getProprietario().getNome());
        System.out.println("Tamanho: " + fogaoInducao.getTamanho());
        System.out.println("Quantidade de bocas: "
                + fogaoInducao.getQuantidadeBocas());
        System.out.println("Potência máxima: "
                + fogaoInducao.getPotenciaMaxima() + " W");

        // Teste dos métodos herdados da superclasse
        fogaoInducao.ligarFogao();
        fogaoInducao.ligarBocas(2);
        System.out.println("Bocas acesas: "
                + fogaoInducao.getBocasAcesas());

        System.out.println("\n=== TESTE 5: Classe Filha FogaoGas ===");

        // Criação do proprietário e do fogão a gás
        Proprietario proprietarioGas = new Proprietario("Carlos");
        FogaoGas fogaoGas =
                new FogaoGas(proprietarioGas, "Grande", 5);

        // Definição do atributo exclusivo da classe filha
        fogaoGas.setTipoGas("GLP");

        // Exibição dos atributos herdados e exclusivos
        System.out.println("Proprietário: "
                + fogaoGas.getProprietario().getNome());
        System.out.println("Tamanho: " + fogaoGas.getTamanho());
        System.out.println("Quantidade de bocas: "
                + fogaoGas.getQuantidadeBocas());
        System.out.println("Tipo de gás: " + fogaoGas.getTipoGas());

        // Teste dos métodos herdados da superclasse
        fogaoGas.ligarFogao();
        fogaoGas.ligarBocas(3);
        System.out.println("Bocas acesas: "
                + fogaoGas.getBocasAcesas());
    }
}
