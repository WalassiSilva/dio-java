import java.util.Scanner;

public class CalcMedia {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro"};

    double media = calcularMediaTurma(alunos, scan);
    System.out.printf("Média da turma %.1f", media);
  }

  static double calcularMediaTurma(String [] alunos, Scanner scan ){
    double soma = 0;
    for(String aluno : alunos) {
      System.out.printf("Nota do aluno %s: ", aluno);
      double nota = scan.nextDouble();
      soma += nota;
    }

    return soma / alunos.length;
  }
}
