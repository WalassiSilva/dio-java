package operacoes_basicas.carrinho;

public class Item {
  private String nome;
  private double preco;
  private int qtde;

  public Item(String nome, double preco, int qtde) {
    this.nome = nome;
    this.preco = preco;
    this.qtde = qtde;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQtde() {
    return qtde;
  }

  @Override
  public String toString() {
    return "\nNome: " + getNome() + " - Preço: " + getPreco() + " - Qtde: " + qtde;
  }
}
