import java.util.Random;

public class ContactarCandidatos {
  public static void main(String[] args) {
    String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };

    for (String candidato : candidatos) {
      ligarCandidato(candidato);
    }
  }

  static void ligarCandidato(String candidato) {
    int tentativas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do {
      atendeu = atender();
      continuarTentando = !atendeu;

      if (continuarTentando) {
        tentativas++;
      } else
        System.out.println("CONTATO REALIZADO COM SUCESSO!");

    } while (continuarTentando && tentativas < 3);

    if (atendeu) {
      System.out.printf("CONSEGUIMOS CONTATO COM %s NA %d° TENTATIVA\n", candidato, tentativas);
    } else {
      System.out.printf("NÃO CONSEGUIMOS CONTATO COM CONDIDATO %s, NÚMERO MAXIMO DE TENTATIVAS: %d\n", candidato,
          tentativas);
    }
  }

  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }

  static void imprimirSelecionador() {
    String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };
    System.out.println("Imprimindo a lista de candidatos informando o indece do elemento.");

    for (int i = 0; i < candidatos.length; i++) {
      System.out.printf("O candidato #%d é o %s. \n", i, candidatos[i]);
    }

    for (String candidato : candidatos) {
      System.out.printf("O candidato selecionado foi %s.\n", candidato);
    }
  }
}
