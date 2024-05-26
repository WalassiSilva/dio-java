package operacoes_basicas.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  private List<Pessoa> pessoas;

  public OrdenacaoPessoa() {
    this.pessoas = new ArrayList<>();
  }

  public void addPessoa(String nome, int idade, double altura) {
    pessoas.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> data = new ArrayList<>(pessoas);
    Collections.sort(data);
    return data;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> data = new ArrayList<>(pessoas);
    Collections.sort(data, new ComparatorPorAltura());
    return data;
  }

  public static void main(String[] args) {
    OrdenacaoPessoa op = new OrdenacaoPessoa();

    op.addPessoa("Guilherme", 27, 1.89);
    op.addPessoa("Walassi", 26, 1.77);
    op.addPessoa("Ana lysa", 26, 1.60);
    op.addPessoa("Alan", 45, 1.65);
    op.addPessoa("Zeno", 13, 1.40);

    System.out.println(op.ordenarPorIdade());
    System.out.println(op.ordenarPorAltura());
  }
}
