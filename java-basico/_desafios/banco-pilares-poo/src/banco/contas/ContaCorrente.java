package banco.contas;


public class ContaCorrente extends Conta {

  public ContaCorrente(){

  }

  @Override
  public void imprimirExtrato() {
    System.out.println("Imprimindo extrato - Conta Corrente");
    dadosDaConta();
  }
}
