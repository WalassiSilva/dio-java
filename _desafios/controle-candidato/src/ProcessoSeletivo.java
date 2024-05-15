import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) throws Exception {

    // analisarCandidado(1900.0);
    // analisarCandidado(2000.0);
    // analisarCandidado(3500.0);

    selecaoCandidatos();
  }

  static void selecaoCandidatos() {
      String [] candidatos = { "João", "Maria", "Pedro", "Ana", "Lucas", "Juliana", "Marcos", "Carla", "André", "Mariana", "Fernando", "Paula", "Rafael", "Lúcia", "Gustavo" };
    
      int candidatosSelecionados = 0;
      int candidatoAtual = 0;
      double salarioBase = 2000.0;

      while(candidatosSelecionados < 5){
        String candidato = candidatos[candidatoAtual];
        double salarioPretendido = valorPretendido();

        System.out.printf("O candidato %s solicitou este valor de salário: %d", candidato, salarioPretendido);
        if(salarioBase >= salarioPretendido) {
          System.out.printf("O candidato %s foi selecionado para a vaga.", candidato);
          candidatosSelecionados ++;
        }
        candidatoAtual ++;
      }
    
    }

    static double valorPretendido() {
      return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

  static void analisarCandidado(double salarioPretendido) {
    double salarioBase = 2000.0;

    if (salarioPretendido < salarioBase) {
      System.out.println("LIGAR PARA O CANDIDATO");
    } else if (salarioPretendido == salarioBase) {
      System.out.println("LIGAR PARA O CANDIDADO COM CONTRAPROPOSTA.");
    } else {
      System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
  }
}
