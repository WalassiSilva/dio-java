public class MinhaClasse {
  String usuario = "Walassi";
  int anoNascimento = 1997;
  boolean estaRico = false;

  public static float somarRenda(float salario, float rendaExtra) {
    return (salario + rendaExtra);
  }

  public static String nomeCompleto(String nome, String sobrenome) {
  //  return (nome + " " + sobrenome);
    return nome.concat(" ").concat(sobrenome);
  }
}
