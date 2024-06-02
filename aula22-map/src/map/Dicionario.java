package map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionario;

  public Dicionario() {
    this.dicionario = new HashMap<>();
  }

  public void addPalavra(String palavra, String significado) {
    dicionario.put(palavra, significado);
  }

  public void removerPalavra(String palavra) {
    if (!dicionario.isEmpty()) {
      dicionario.remove(palavra);
    }
  }

  public void exibirPlavras() {
    System.out.println(dicionario);
  }

  public String pesquisarPorPalavra(String palavra){
    String data = null;
    if(!dicionario.isEmpty()){
      data =dicionario.get(palavra);
    }
    return data;
  }
  
  public static void main(String [] args){
    
    Dicionario dicionario = new Dicionario();

    dicionario.addPalavra("oi", "é uma saudação feita");
    dicionario.addPalavra("tchau", "é uma forma de se despedir de alguem");
    dicionario.addPalavra("sono", "É a merda que acontece comigo todo dia enquanto estou estudando sem praticar");
    dicionario.removerPalavra("oi");

    System.out.println(dicionario.pesquisarPorPalavra("sono"));

    // dicionario.exibirPlavras();
  }

}
