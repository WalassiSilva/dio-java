package map;

import java.util.HashMap;
import java.util.Map;

public class Contatos {
  private Map<String, String> contatos;

  public Contatos() {
    this.contatos = new HashMap<>();
  }

  public void addContato(String nome, String telefone) {
    contatos.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!contatos.isEmpty()) {
      contatos.remove(nome);
    }
  }

  public void exibirContatos() {
    System.out.println(contatos);
  }

  public String pesquisarPorNome(String nome) {
    String data = null;
    if (!contatos.isEmpty()) {
      data = contatos.get(nome);
    }
    return data;
  }

  public static void main(String[] args) {
    Contatos contatos = new Contatos();

    contatos.exibirContatos();

    contatos.addContato("ana", "99999-9999");
    contatos.addContato("igor", "98888-9999");
    contatos.addContato("ivo", "97777-9999");
    contatos.addContato("beto", "96666-9999");
    contatos.addContato("bia", "95555-9999");
    contatos.addContato("ana", "94444-9999");

    contatos.exibirContatos();

    contatos.removerContato("igor");
    contatos.exibirContatos();
    System.out.println(contatos.pesquisarPorNome("ivo"));
    
  }
}
