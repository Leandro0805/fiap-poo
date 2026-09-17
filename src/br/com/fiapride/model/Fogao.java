package br.com.fiapride.model;

public class Fogao {

    private String tamanho;
    private boolean ligado;
    private int quantidade_bocas;
    private int bocas_acesas;

    public Fogao (String tamanho, int quantidade_bocas) {
    	this.setTamanho(tamanho);
    	this.setQuantidade_bocas(quantidade_bocas);
    	System.out.println("O fogão possui o tamanho" + this.tamanho + "e uma quantidade de" + this.quantidade_bocas + " bocas");
    	
    }
    // Get e set de tamanho
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    // Get e set de ligado
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Get e set de quantidade_bocas
    public int getQuantidade_bocas() {
        return quantidade_bocas;
    }

    public void setQuantidade_bocas(int quantidade_bocas) {
        if (quantidade_bocas > 0) {
            this.quantidade_bocas = quantidade_bocas;
        } else {
            System.out.println("Quantidade de bocas inválida!");
        }
    }

    // Get e set de bocas_acesas
    public int getBocas_acesas() {
        return bocas_acesas;
    }

    public void setBocas_acesas(int bocas_acesas) {
        if (bocas_acesas >= 0 && bocas_acesas <= this.quantidade_bocas) {
            this.bocas_acesas = bocas_acesas;
        } else {
            System.out.println("Quantidade de bocas acesas inválida!");
        }
    }

    // Função para ligar o fogão
    public void ligar_fogao() {
        if (ligado) {
            System.out.println("O seu fogão já está ligado!");
        } else {
            ligado = true;
            System.out.println("Fogão ligado!");
        }
    }

    // Função para ligar uma quantidade de bocas
    public void ligar_bocas(int bocas_acessas) {

        if (!ligado) {
            System.out.println(
                "Não é possível acender as bocas com o fogão desligado!"
            );

        } else if (bocas_acessas <= 0 || bocas_acessas > quantidade_bocas) {
            System.out.println("Quantidade de bocas inválida!");

        } else {
            setBocas_acesas(bocas_acessas);

            System.out.println(
                "Foram acendidas " + bocas_acessas + " bocas."
            );
        }
    }
    
}