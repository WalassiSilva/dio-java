public abstract class Veiculo {
  private String chassi;

  public abstract void ligar();

  private String placa() {
    return ("123fasd");
  }

  public String getChassi() {
    return chassi;
  }

  public void setChassi(String chassi){
    this.chassi = chassi;
  }
}
