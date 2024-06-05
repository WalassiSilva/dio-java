import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) throws Exception {

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Desc: Bootcamp de Java");
    curso1.setCargaHorario(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso JavaScript");
    curso2.setDescricao("Desc: Bootcamp de JavaScript");
    curso2.setCargaHorario(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de Java");
    mentoria.setDescricao("Desc: Mentoria de Java");
    mentoria.setData(LocalDate.now());

    // System.out.println(curso1);
    // System.out.println(curso2);
    // System.out.println(mentoria);

    Bootcamp java_baBootcamp = new Bootcamp();
    java_baBootcamp.setNome("Bootcamp java backend");
    java_baBootcamp.setDescricao("Descrição java backend");
    java_baBootcamp.getConteudos().add(curso1);
    java_baBootcamp.getConteudos().add(curso2);
    java_baBootcamp.getConteudos().add(mentoria);

    Dev camila = new Dev();
    camila.setNome("Camila");
    camila.inscreverBootcamp(java_baBootcamp);
    camila.progredir();
    System.out.println("\nCamila - Conteudos inscritos" + camila.getConteudosIncritos());
    System.out.println("\nCamila - Conteudos Concluidos" + camila.getConteudosConcluidos());
    System.out.println("\nXP: " + camila.calcularXp());

    Dev ana = new Dev();
    ana.setNome("Ana");
    ana.inscreverBootcamp(java_baBootcamp);
    while (ana.getConteudosIncritos().size() > 0) {
      ana.progredir();
    }
    System.out.println("\nAna - Conteudos inscritos" + ana.getConteudosIncritos());
    System.out.println("\nAna - Conteudos Concluidos"  + ana.getConteudosConcluidos());
    System.out.println("\nXP: " + ana.calcularXp());

  }
}
