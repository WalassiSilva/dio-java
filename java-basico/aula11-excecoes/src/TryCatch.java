import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TryCatch {
  public static void main(String[] args) {

    try {
      Scanner scan = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("Digite seu nome");
      String nome = scan.next();

      System.out.println("Digite seu sobrenome");
      String sobrenome = scan.next();

      System.out.println("Digite sua idade");
      int idade = scan.nextInt();

      System.out.println("Digite sua idade");
      float altura = scan.nextFloat();

      System.out
          .println("nome: " + nome + " " + sobrenome + "\nidade: " + idade + "\naltura: " + altura);
    } catch (InputMismatchException e) {
      System.out.println( "ERROR: Os campos idade e altura precisam ser numéricos");
    }

  }
}
