package escola;
public class Escola {
public static void main(String[] args) {
  Aluno felipe = new Aluno();
  felipe.setNome("Felipe");
  felipe.setIdade(8);

  System.out.printf("O aluno %s tem %d anos", felipe.getNome(), felipe.getIdade());
}
  
}
