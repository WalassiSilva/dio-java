package operacoes_basicas.lista_tarefas;

public class Tarefa {
  private String descricao;
  private boolean completo;


  public Tarefa(String descricao, boolean completo){
    this.descricao = descricao;
    this.completo = completo;
  }


  public String getDescricao() {
    return descricao;
  }


  public boolean getCompleto() {
    return completo;
  }

  public void setDescricao(String descricao){
    this.descricao = descricao;
  }

  public void setCompleto(boolean completo){
    this.completo = completo;
  }


  @Override
  public String toString() {
    return "\nTarefa [descricao=" + descricao + ", completo=" + completo + "]";
  }

  
}
