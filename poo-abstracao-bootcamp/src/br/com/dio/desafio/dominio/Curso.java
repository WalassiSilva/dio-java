package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

  private int cargaHoraria;

  public Curso() {}  

  @Override
  public double calcularXp() {
    return XP_PADRAO * cargaHoraria;
  }

  public int getCargaHoraria () {
    return cargaHoraria;
  }

  public void setCargaHorario(int cargaHorario){
    this.cargaHoraria = cargaHorario;
  }

  @Override
  public String toString() {
    return "\nCurso [getTitulo()=" + getTitulo() + "\ngetCargaHoraria()=" + getCargaHoraria() + "\ngetDescricao()="
        + getDescricao() + "\n]";
  }




  
}
