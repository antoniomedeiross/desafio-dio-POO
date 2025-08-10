package br.com.dio.desafio.dominio;

public class Usuario extends Pessoa {
    public Usuario(String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Usuário: " + getNome());
    }
}
