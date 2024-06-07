public class SistemaCadastro {
  public static void main(String[] args) {
    Pessoa marcos = new Pessoa("MARCOS", "12365421");

    marcos.setEndereco("Rua das Estrelas");

    System.out.printf("nome: %s.\ncpf: %s.\nEndereço: %s.", marcos.getNome(), marcos.getCpf(), marcos.getEndereco());
  }
}
