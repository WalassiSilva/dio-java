package operacoes_basicas.ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
  private String nome;
  private int cod;
  private double preco;
  private int qtde;

  public Produto(String nome, int cod, double preco, int qtde) {
    this.cod = cod;
    this.nome = nome;
    this.preco = preco;
    this.qtde = qtde;
  }

  public String getNome() {
    return nome;
  }

  public int getCod() {
    return cod;
  }

  public double getPreco() {
    return preco;
  }

  public int getQtde() {
    return qtde;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + cod;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Produto other = (Produto) obj;
    if (cod != other.cod)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "\nProduto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", qtde=" + qtde + "]";
  }

  @Override
  public int compareTo(Produto p) {
    return nome.compareToIgnoreCase(p.getNome());
  }


  
}

class ComparatorPorPreco implements Comparator<Produto>
{
  @Override 
  public int compare (Produto p1, Produto p2){
    return Double.compare(p1.getPreco(), p2.getPreco());
  }
}

class ComparatorPorCod implements Comparator<Produto>{
  @Override
  public int compare (Produto p1, Produto p2){
    return Integer.compare(p1.getCod(), p2.getCod());
  }
}