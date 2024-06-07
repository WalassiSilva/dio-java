import java.util.Scanner;

public class DesafioControleFluxo {
  public static void main(String[] args) throws Exception {

    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = scan.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = scan.nextInt();

    try {
      contar(parametroUm, parametroDois);
    } catch (InvalidParmsException e) {
      System.out.printf("Error: %s. \n O segundo parâmetro deve ser maior que o primeiro", e);
      // System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }

  }

  static void contar(int parametroUm, int parametroDois) throws InvalidParmsException {
    if (parametroUm > parametroDois) {
      throw new InvalidParmsException();
    }

    int contagem = parametroDois - parametroUm;

    for (int i = 1; i <= contagem; i++) {
      System.out.printf("Imprimindo o número %d.\n", i);
    }
  }
}
