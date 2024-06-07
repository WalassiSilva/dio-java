package map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> estoque;

  public EstoqueProdutos() {
    this.estoque = new HashMap<>();
  }

  public void addProduto(long cod, String nome, double preco, int qtde) {
    estoque.put(cod, new Produto(nome, preco, qtde));
  }

  public void exibirProdutos() {
    System.out.println(estoque);
  }

  public double calcularTotalEstoque() {
    double total= 0;
    if(!estoque.isEmpty()){
      for(Produto p : estoque.values()){
        total += p.getQtde() * p.getPreco();
      }
    }
    return total;
  }

  public Produto obterMaiorProduto(){
    Produto data = null;
    double max = Double.MIN_VALUE;
    for(Produto p : estoque.values()){
      if(p.getPreco() > max)
      data = p;
    }
    return data;
  }

  public static void main(String[] args) {

    EstoqueProdutos estoque = new EstoqueProdutos();
    estoque.addProduto(1, "celular", 1000, 3);
    estoque.addProduto(2, "notebook", 2000, 2);
    estoque.addProduto(3, "tablet", 3000, 5);
    // estoque.exibirProdutos();
    // System.out.println(estoque.calcularTotalEstoque());
    System.out.println(estoque.obterMaiorProduto());
  }
}
