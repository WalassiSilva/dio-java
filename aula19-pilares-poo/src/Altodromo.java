public class Altodromo {
  public static void main(String[] args) {
    Carro jeep = new Carro();
    Moto z400 = new Moto();

    // jeep.ligar();
    jeep.setChassi("123-019230");
    // z400.ligar();
    z400.setChassi("4561564");
  
    Veiculo automovel = z400;
    automovel.ligar();

  }

}
