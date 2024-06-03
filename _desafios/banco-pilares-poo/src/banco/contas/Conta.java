package banco.contas;

public abstract class Conta implements IConta {

  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;
  
  
  protected int agencia;
  protected int numeroConta;
  protected double saldo;

  public Conta() {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numeroConta = SEQUENCIAL++;
  }

  @Override
  public void transferir(double valor, Conta destino) {
    if(valor > saldo){
      System.out.println("Saldo insuficiente");
      return;
    }

    this.saldo -= valor;
    destino.saldo += valor;

    System.out.printf("Transferência de : %.2f. - %s \nSaldo atual: %.2f\n-------------------------\n",
        valor, destino, saldo);
  }

  @Override
  public void sacar(double valor) {
    saldo -= valor;
    System.out.printf("Saque: %.2f.\nSaldo atual: %.2f.\n-------------------------\n", valor, saldo);
  }

  @Override
  public void depositar(double valor) {
    saldo += valor;
    System.out.printf("Deposito: %.2f.\nSaldo atual: %.2f.\n-------------------------\n", valor, saldo);
  }

  protected void dadosDaConta() {
    System.out.printf(" - Agencia: %d - Conta: %d \nSaldo: %.2f.\n-------------------------\n",
         agencia, numeroConta, saldo);
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public String toString() {
    return "Conta [agencia=" + agencia + ", numeroConta=" + numeroConta + "]";
  }
}
