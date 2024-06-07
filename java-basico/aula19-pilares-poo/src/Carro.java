public class Carro extends Veiculo {
  
  public void ligar() {
    conferirGas();
    conferirCambio();
    System.out.println("Carro Ligado!");
  }

  private void conferirGas() {
    System.out.println("Conferindo Gás");
  }

  private void conferirCambio(){
    System.out.println("Conferindo Cambio e P");
  }


}
