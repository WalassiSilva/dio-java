package operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class PalavrasUnicas {
  private Set<Palavra> palavras;

  public PalavrasUnicas() {
    this.palavras = new HashSet<>();
  }

  public void addPalavra(String palavra) {
    palavras.add(new Palavra(palavra));
  }

  public void removerPalavra(String palavra) {
    Palavra data = null;
    for (Palavra p : palavras) {
      if (p.getPalavra().equalsIgnoreCase(palavra)) {
        data = p;
        break;
      }
    }
    palavras.remove(data);
  }

  public void contarPalavras() {
    System.out.println(palavras.size());
  }

  public void exibirPalavras() {
    System.out.println(palavras);
  }


  public static void main(String[] args) {
    PalavrasUnicas pu = new PalavrasUnicas();

    pu.exibirPalavras();

    pu.addPalavra("preciso");
    pu.addPalavra("jogar");
    pu.addPalavra("estudar");

    pu.removerPalavra("Jogar");
    pu.exibirPalavras();
    pu.contarPalavras();
  }

}
