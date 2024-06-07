package operacoes_basicas.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

  private Set<Produto> produtos;
  

  public CadastroProdutos(){
    this.produtos = new HashSet<>();
  }

  public void addProduto(int cod, String name, double preco, int qtde){
    produtos.add(new Produto(name, cod, preco, qtde ));
    System.out.printf("Produto adicionado: %d -  %s - %.2f - (%d)\n", cod, name, preco, qtde);
  }

  public Set<Produto> exibiProdutosPorNome(){
    Set<Produto> data = new TreeSet<>(produtos);
    return data;
  }

  public Set<Produto> exibirPorPreco(){
    Set<Produto> data = new TreeSet<>( new ComparatorPorPreco());

    data.addAll(produtos);

    return data;
  }

  public static void main(String[] args) {
    CadastroProdutos produtos = new CadastroProdutos();
    produtos.addProduto(1, "Arroz", 29.90, 1);
    produtos.addProduto(2, "Arroz", 29.90, 1);
    produtos.addProduto(3, "feijao", 7.90, 1);
    produtos.addProduto(4, "alga", 14.90, 1);

    // System.out.println(produtos.produtos);
    System.out.println(produtos.exibiProdutosPorNome());
    System.out.println(produtos.exibirPorPreco());
  }

}
