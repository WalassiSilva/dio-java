package operacoes_basicas.soma_numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numeros {

  private List<Integer> numeros;

  public Numeros() {
    this.numeros = new ArrayList<>();
  }

  public void addNumero(int n) {
    this.numeros.add(n);
  }

  public List<Integer> ordenar() {
    List<Integer> data = new ArrayList<>(numeros);

    if (!numeros.isEmpty()) {
      Collections.sort(data);
    }
    return data;
  }

  public int min() {
    return ordenar().get(0);
  }

  public int max() {
    return ordenar().get(ordenar().size() - 1);
  }

  public void showNumeros() {
    System.out.println(numeros);
  }

  public int soma() {
    int total = 0;

    for (int i : numeros) {
      total += i;
    }
    return total;
  }

  @Override
  public String toString() {
    return "\nNumeros:" + numeros;
  }

  public static void main(String[] args) {
    Numeros num = new Numeros();

    num.addNumero(10);
    num.addNumero(3);
    num.addNumero(20);
    num.addNumero(13);
    num.addNumero(11);

    num.showNumeros();
    System.out.println("valor minimo: "+num.min());
    System.out.println("valor maximo: "+num.max());
    System.out.println("soma: "+ num.soma());
  }
}