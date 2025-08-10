import br.com.dio.desafio.dominio.Biblioteca;
import br.com.dio.desafio.dominio.Funcionario;
import br.com.dio.desafio.dominio.Livro;
import br.com.dio.desafio.dominio.Usuario;

public class Main {
    public static void main(String[] args) {
        // Criando biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criando alguns livros
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro l2 = new Livro("1984", "George Orwell");

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        // Criando pessoas
        Usuario u1 = new Usuario("Antonio");
        Funcionario f1 = new Funcionario("Maria");

        // Apresentações (polimorfismo)
        u1.apresentar();
        f1.apresentar();

        // Listando livros
        biblioteca.listarLivros();

        // Emprestando um livro
        Livro livroBuscado = biblioteca.buscarLivro("1984");
        if (livroBuscado != null) {
            livroBuscado.emprestar();
        }

        biblioteca.listarLivros();

        // Devolvendo o livro
        livroBuscado.devolver();
        biblioteca.listarLivros();
    }
}
