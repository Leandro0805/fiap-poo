package br.com.fiapride.model;

public class Fogao {
    private Proprietario proprietario;
    private String tamanho;
    private boolean ligado;
    private int quantidadeBocas;
    private int bocasAcesas;

    public Fogao(Proprietario proprietario, String tamanho, int quantidadeBocas) {
        // Validação do Proprietário
        if (proprietario == null) {
            System.out.println("Erro: Todo fogão precisa de um proprietário válido!");
        } else {
            this.proprietario = proprietario;
        }

        // Validação do Tamanho
        if (tamanho == null || tamanho.trim().isEmpty()) {
            System.out.println("Erro: Tamanho inválido!");
            this.tamanho = "Indefinido";
        } else {
            this.tamanho = tamanho;
        }

        // Validação da Quantidade de Bocas
        if (quantidadeBocas > 0) {
            this.quantidadeBocas = quantidadeBocas;
        } else {
            System.out.println("Erro: Quantidade de bocas deve ser maior que zero!");
            this.quantidadeBocas = 1; // Valor padrão de segurança
        }
        
        this.ligado = false;
        this.bocasAcesas = 0;
    }

    // Encapsulamento: setBocasAcesas passa a ser private para impedir acesso externo direto
    private void setBocasAcesas(int bocasAcesas) {
        if (bocasAcesas >= 0 && bocasAcesas <= this.quantidadeBocas) {
            this.bocasAcesas = bocasAcesas;
        } else {
            System.out.println("Quantidade de bocas acesas inválida!");
        }
    }

    // Getters de leitura
    public Proprietario getProprietario() {
        return proprietario;
    }

    public String getTamanho() {
        return tamanho;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getQuantidadeBocas() {
        return quantidadeBocas;
    }

    public int getBocasAcesas() {
        return bocasAcesas;
    }

    // Métodos de negócio (comportamento)
    public void ligarFogao() {
        if (ligado) {
            System.out.println("O seu fogão já está ligado!");
        } else {
            ligado = true;
            System.out.println("Fogão ligado!");
        }
    }

    public void desligarFogao() {
        this.ligado = false;
        this.bocasAcesas = 0;
        System.out.println("Fogão desligado e todas as bocas foram apagadas.");
    }

    public void ligarBocas(int quantidade) {
        if (!ligado) {
            System.out.println("Não é possível acender as bocas com o fogão desligado!");
        } else if (quantidade <= 0 || quantidade > quantidadeBocas) {
            System.out.println("Quantidade de bocas inválida!");
        } else {
            setBocasAcesas(quantidade);
            System.out.println("Foram acendidas " + quantidade + " bocas.");
        }
    }
    //Função genérica que se adaptará a classe filha
    public void prepararParaUso() {
        System.out.println("Preparando o fogão para utilização.");
    }
}