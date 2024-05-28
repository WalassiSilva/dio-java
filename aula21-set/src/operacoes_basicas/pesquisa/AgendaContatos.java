package operacoes_basicas.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatos;

  public AgendaContatos() {
    this.contatos = new HashSet<>();
  }

  public void addContato(String nome, int numero) {
    contatos.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    System.out.println(contatos);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> data = new HashSet<Contato>();
    for (Contato c : contatos) {
      if (c.getNome().startsWith(nome)) {
        data.add(c);
      }
    }
    return data;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato data = null;
    for (Contato c : contatos) {
      if (c.getNome().equalsIgnoreCase(nome)) {
        c.setNumero(novoNumero);
        data = c;
        break;
      }
    }
    return data;
  }

  public static void main(String[] args) {
    AgendaContatos agenda = new AgendaContatos();

    agenda.exibirContatos();
    
    agenda.addContato("walassi", 1111);
    agenda.addContato("walassi", 2222);
    agenda.addContato("silva b", 3333);
    agenda.addContato("walassi s", 4444);
    agenda.addContato("walassi bs", 5555);
    agenda.atualizarNumeroContato("silva b", 9999);
    System.out.println(agenda.pesquisarPorNome("silva"));
    // agenda.exibirContatos();
  }

}
