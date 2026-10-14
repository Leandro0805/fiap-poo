package br.com.fiapride.model;

public class Proprietario {
    private String nome;

    public Proprietario(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome do proprietário não pode ser vazio!");
            this.nome = "Proprietário não informado";
        } else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }
}