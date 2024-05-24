package lanchonete.atendimento;

public class Atendente {
  public void servirMesa() {
    pegarLancheCozinha();
  System.out.println("SERVINDO MESA");
  }
  
  private void pegarLancheCozinha() {
  System.out.println("PEGANDO O LANCHE NA COZINHA");
  }
  public void receberPagamento() {
  System.out.println("RECEBENDO O PAGAMENTO");
  }
   void trocarGas() {
  System.out.println("ATENDENTE TROCANDO O GAS");
  }
  private void pegarPedidoBalcao() {
  System.out.println("PEGANDO O PEDIDO NO BALCAO");
  }

}
