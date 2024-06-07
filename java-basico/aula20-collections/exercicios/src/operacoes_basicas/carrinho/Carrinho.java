package operacoes_basicas.carrinho;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
  private List<Item> carrinho;  
  
  public Carrinho() {
    this.carrinho = new ArrayList<>();
  }

  public void addItem(String nome, double preco, int qtde){
    carrinho.add( new Item(nome, preco, qtde));
  }

  public void removeItem(String nome){
    List<Item> itensParaRemover = new ArrayList<>();

    for( Item i : carrinho){
      if(i.getNome().equalsIgnoreCase(nome)){
        itensParaRemover.add(i);
      }
    }

    carrinho.removeAll(itensParaRemover);
  }

  public double calcularValorTotal(){
    double total = 0;
    for(Item i : carrinho){
      total += i.getPreco() * i.getQtde();
    }

    return total;
  }

  public void exibirItems() {
    System.out.println(carrinho);
  }

 public static void main(String[] args){
  Carrinho carrinho = new Carrinho();

  carrinho.exibirItems();
  carrinho.addItem("Pão", 0.6, 8);
  carrinho.addItem("Açaí", 20.0, 1);
  carrinho.addItem("Açaí", 20.0, 1);
  carrinho.addItem("Açaí", 20.0, 1);
  carrinho.exibirItems();
  carrinho.removeItem("açaí");
  carrinho.exibirItems();
  System.out.println(carrinho.calcularValorTotal());
 } 
}
