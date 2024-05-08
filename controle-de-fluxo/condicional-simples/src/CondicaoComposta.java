public class CondicaoComposta {
    public static void main(String[] args) {
        int nota = 8;

        if (nota > 6)
            System.out.println("APROVADO!");

        else
            System.out.println("REPROVADO!");

        double saldo = 25.0;
        double valorSolicitado = 37.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
            System.out.println("saque de: " + valorSolicitado + " efetuado ");
        } else 
        System.out.println("Saldo insuficiente");

        System.out.println("Saldo atual: " + saldo);
    }
}