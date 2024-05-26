package operacoes_basicas.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

  private List<Livro> livros;

  public CatalogoLivros() {
    this.livros = new ArrayList<>();
  }

  public void addLivro(String titulo, String autor, int anoPublicacao) {
    livros.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> data = new ArrayList<>();

    if (!livros.isEmpty()) {
      for (Livro l : livros) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          data.add(l);
        }
      }
    }
    return data;
  }

  public List<Livro> pesquisarPorIntervalo(int inicio, int fim) {
    List<Livro> data = new ArrayList<>();
    if (!livros.isEmpty()) {
      for (Livro l : livros) {
        if (inicio <= l.getAnoPublicacao() && fim >= l.getAnoPublicacao()) {
          data.add(l);
        }
      }
    }
    return data;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro data = null;
    for (Livro l : livros) {
      if (l.getTitulo().equalsIgnoreCase(titulo)) {
        data = l;
        break;
      }
    }
    return data;
  }

  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    catalogoLivros.addLivro("livro 1", "autor 1", 2020);
    catalogoLivros.addLivro("livro 1", "autor 2", 2021);
    catalogoLivros.addLivro("livro 2", "autor 2", 2022);
    catalogoLivros.addLivro("livro 3", "autor 3", 2023);
    catalogoLivros.addLivro("livro 4", "autor 4", 2024);
    catalogoLivros.addLivro("livro 5", "autor 5", 1994);

    // System.out.println(catalogoLivros.pesquisarPorAutor("autor 4"));
    // System.out.println(catalogoLivros.pesquisarPorIntervalo(2020,2020));
    System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));
  }

}
