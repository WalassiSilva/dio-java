package operacoes_basicas.lista_tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  Set<Tarefa> tarefas;

  public ListaTarefas() {
    this.tarefas = new HashSet<>();
  }

  public void addTarefa(String descricao, boolean completo) {
    tarefas.add(new Tarefa(descricao, completo));
    System.out.println("tarefa adicionada");
  }

  public void removerTarefa(String descricao) {
    Tarefa data = null;
    for (Tarefa t : tarefas) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        data = t;
        break;
      }
    }
    tarefas.remove(data);
    System.out.println("tarefa removida");
  }

  public void exibirTarefas() {
    System.out.println(tarefas);
  }

  public void contarTarefas() {
    System.out.println(tarefas.size());
  }

  public Set<Tarefa> obterTarefasCompletas() {
    Set<Tarefa> data = new HashSet<Tarefa>();
    for (Tarefa t : tarefas) {
      if (t.getCompleto() == true) {
        data.add(t);
      }
    }
    return data;
  }

  public Set<Tarefa> obterTarefasIncompletas() {
    Set<Tarefa> data = new HashSet<Tarefa>();
    for (Tarefa t : tarefas) {
      if (t.getCompleto() == false) {
        data.add(t);
      }
    }
    return data;
  }

  public void concluirTarefa(String descricao) {
    Tarefa data = null;
    for (Tarefa t : tarefas) {
      if (t.getDescricao().equals(descricao)) {
        data = t;
        data.setCompleto(true);
        System.out.println("tarefa concluida");
      }
    }
  }

  public void naoConcluirTarefa(String descricao) {
    Tarefa data = null;
    for (Tarefa t : tarefas) {
      if (t.getDescricao().equals(descricao)) {
        data = t;
        data.setCompleto(false);
        System.out.println("tarefa não concluida");
      }
    }
  }

  public void limparLista() {
    tarefas = new HashSet<>();
  }

  public static void main(String[] args) {
    ListaTarefas tarefas = new ListaTarefas();

    tarefas.addTarefa("task1", false);
    tarefas.addTarefa("task2", false);
    tarefas.addTarefa("task3", false);
    tarefas.addTarefa("task4", false);
    
    tarefas.concluirTarefa("task2");
    tarefas.concluirTarefa("task4");
    System.out.println(tarefas.obterTarefasIncompletas());
    // tarefas.concluirTarefa("task1");
    // tarefas.concluirTarefa("task2");
    // tarefas.concluirTarefa("task3");
    
    // tarefas.naoConcluirTarefa("task3");
    // tarefas.exibirTarefas();


  }

}
