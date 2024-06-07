package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
  public void adicionarLancheteBalcao() {
    System.out.println("ADICIONANDO LANCHE NATURAl HAMBURGER NO BALCAO");
  }

  public void adicionarSucoBalcao() {
    System.out.println("ADICIONANDO SUCO NO BALCAO");
  }
  private void prepararVitamina() {
    System.out.println("PREPARANDO VITAMINA");
  }
  private void lavarIngredientes() {
    System.out.println("LAVANDO INGREDIENTES");
  }
  private void selecionarIngredientes() {
    System.out.println("SELECIONANDO INGREDIENTES");
  }

  public void adicionarComboBalcao() {
    adicionarLancheteBalcao();
    adicionarSucoBalcao();
  }

  // public void pedirTrocaGas(Atendente meuAmigo) {
  //   meuAmigo.trocarGas();
  // }

  private void pedirTrocaGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
  }

  private void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entragarIngredientes();
  }

}
