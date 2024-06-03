package banco;

import java.util.ArrayList;
import java.util.List;

import banco.cliente.Cliente;

public class Banco {

  private String nome;
  private List<Cliente> clientes;

  protected Cliente cliente;

  public Banco(String nome){
    this.nome = nome;
    clientes = new ArrayList<>();
  }

  public void addCliente (Cliente cliente){
    clientes.add(cliente);
  }

public List<Cliente> listarClientes() {
  return clientes.stream().toList();
}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public List<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(List<Cliente> clientes) {
    this.clientes = clientes;
  }

  @Override
  public String toString() {
    return "Banco [nome=" + nome + ", clientes=" + clientes + "]";
  }

}