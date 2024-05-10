public class CondicaoSimples {

    public static void main (String [] args){
        double saldo = 25.0;
        double valorSolicitado = 37.0;

        if(valorSolicitado < saldo) {
            saldo -= valorSolicitado;
            System.out.println("saque de: " + valorSolicitado + " efetuado ");
        }

        System.out.println("Saldo atual: " + saldo);
    }
}
