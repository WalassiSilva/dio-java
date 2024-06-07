import java.util.Scanner;

public class VerificadorNumeroConta {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    try {
      String conta = scan.next();

      verificarNumeroConta(conta);

      // Imprime que o número de conta é válido:
    } catch (IllegalArgumentException e) {

      e.getStackTrace();
      System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
    }

    finally {
      scan.close();
    }
  }

  private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {

    if (numeroConta.length() == 8) {
      System.out.println("Numero de conta valido.");
    } else {
      throw new IllegalArgumentException();
    }

  }
}