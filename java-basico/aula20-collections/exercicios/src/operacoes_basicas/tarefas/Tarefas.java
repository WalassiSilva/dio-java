package operacoes_basicas.tarefas;

import java.util.ArrayList;
import java.util.List;

public class Tarefas {
  // atributos
  private List<Tarefa> tarefas;

  public Tarefas() {
    this.tarefas = new ArrayList<>();
  }

  public void addTarefa(String descricao){
   tarefas.add(new Tarefa(descricao)); 
  }

  public void removeTarefa(String descricao){
    // tarefas.remove
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for(Tarefa t : tarefas){
      if(t.getDescricao().equalsIgnoreCase(descricao)){
        tarefasParaRemover.add(t);
      }
    } 

    tarefas.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTarefas() {
    return tarefas.size();
  }

  public void obterDeacricoesTarefas() {
    System.out.println(tarefas);
  }

  public static void main(String[] args){
    Tarefas tarefas = new Tarefas();

    System.out.printf("Numero de tarefas: %d\n",tarefas.obterNumeroTarefas());
    tarefas.addTarefa("parar despertador");
    tarefas.addTarefa("parar despertador");
    tarefas.addTarefa("levantar");
    System.out.printf("Numero de tarefas: %d\n",tarefas.obterNumeroTarefas());
    // tarefas.removeTarefa("parar despertador");
    System.out.printf("Numero de tarefas: %d\n",tarefas.obterNumeroTarefas());

    tarefas.obterDeacricoesTarefas();
  }
}
