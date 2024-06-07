package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
  public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();
    cozinheiro.adicionarComboBalcao();
    cozinheiro.adicionarLancheteBalcao();
    cozinheiro.adicionarSucoBalcao();

    Almoxarife almoxarife = new Almoxarife();
    // almoxarife.controlarEntrada();
    // almoxarife.controlarSaida();
    // almoxarife.entragarIngredientes();
    // almoxarife.trocarGas();

    Atendente atendente = new Atendente();
    // atendente.pegarLancheCozinha();
    // atendente.pegarPedidoBalcao();
    atendente.receberPagamento();
    atendente.servirMesa();
    // atendente.trocarGas();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();

    // cliente.consultarSaldoAplicativo();
  }
}
