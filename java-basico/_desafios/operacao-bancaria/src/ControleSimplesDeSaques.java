import java.util.Scanner;

public class ControleSimplesDeSaques {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double limiteDiario = scan.nextDouble();
    double saque = 0.0;

    for (double i = saque; limiteDiario > i; limiteDiario -= i) {
      saque = scan.nextDouble();
      if (saque == 0.0) {
        System.out.println("Transacoes encerradas.");
        break;
      }
      if (limiteDiario > saque) {
        limiteDiario -= saque;
        System.out.println("Saque realizado. Limite restante: " + limiteDiario);
      } else if(saque > limiteDiario) {
        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
        break;
      }
    }
    scan.close();
  }
}
