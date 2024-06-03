package banco.contas;

public class ContaPoupanca extends Conta {

  public ContaPoupanca() {
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("Imprimindo extrato - Conta Poupança");
    dadosDaConta();
  }
}
