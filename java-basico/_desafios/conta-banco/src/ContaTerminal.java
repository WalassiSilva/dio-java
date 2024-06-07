import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Agência!");
        String agency = scan.next();

        System.out.println("Por favor, digite o número da conta!");
        int account = scan.nextInt();

        System.out.println("Por favor, digite o seu nome");
        String name = scan.next();

        Random random = new Random();
        int randomNum = random.nextInt(100);
        randomNum = 51;
        double balance = random.nextDouble(20000.00);

        if (randomNum >= 50) {
            System.out.printf("Olá " + name + ", obrigado por ter um conta em nosso banco, sua agência é " + agency
                    + ", conta " + account + ", seu saldo de " + String.format("%.2f", balance) + " está disponível para uso.");
        } else {

            balance = random.nextDouble(1000.00);
            System.out.printf("Caro " + name
                    + ", notamos que se tornou cliente recentemente, estamos felizes por te-lo conosco. Segue a confirmação dos seus dados: \n");
            System.out.printf(
                    "nome: " + name + "\n Agência: " + agency + "\n Conta: " + account + "\n Saldo: " + String.format("%.2f", balance));
        }


    }
}
