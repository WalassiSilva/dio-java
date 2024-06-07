import java.util.Scanner;

public class SimulacaoBancaria {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double saldo = 0.0;
    // Loop infinito para manter o programa em execução até que o usuário decida
    // sair
    while (true) {

      int opcao = scan.nextInt();
      // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
      // pelo usuário.

      switch (opcao) {
        case 1: {
          double deposito = scan.nextDouble();
          saldo += deposito;
          System.out.println("Saldo atual: "+saldo);
          
        }break;

        case 2: {
          double saque = scan.nextDouble();
          if (saque > saldo) {
            System.out.println("Saldo insuficiente.");
          } else {
            saldo -= saque;
            System.out.println("Saldo atual: " + saldo);
          }
        }break;

        case 3: {
          System.out.println("Saldo atual: " + saldo);          
        }break;
        case 0: {
          System.out.println("Programa encerrado.");
          return;

        }
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }

      scan.close();
    }
  }

}