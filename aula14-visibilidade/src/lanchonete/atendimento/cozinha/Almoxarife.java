package lanchonete.atendimento.cozinha;

public class Almoxarife {
  private void controlarEntrada() {
    System.out.println("CONTROLANDO A ENTRADA E ITENS");
  }
  private void controlarSaida() {
    System.out.println("CONTROLANDO A SAIDA E ITENS");
  }

 void entragarIngredientes() {
    System.out.println("ENTREGANDO INGREDIENTES");
    controlarSaida();
  }

   void trocarGas() {
    System.out.println("ALMOXARIFE TROCANDO O GAS");
  }

}
