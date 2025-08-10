package br.com.dio.desafio.dominio;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        System.out.println("\nLivros disponíveis:");
        for (Livro livro : livros) {
            String status = livro.isEmprestado() ? "Emprestado" : "Disponível";
            System.out.println("- " + livro.getTitulo() + " (" + status + ")");
        }
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
}

