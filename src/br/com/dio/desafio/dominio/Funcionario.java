package br.com.dio.desafio.dominio;

public class Funcionario extends Pessoa {
    public Funcionario(String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Funcionário: " + getNome());
    }
}

