/* Representa um operação que nano aceita argumento alhum e retorna um resultado tipo T.
 * É comumente usado pra criar ou fornecer novos objetos de um determinado tipo
 */

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class supplierExample {
  public static void main(String[] args) {

    // Usar o Supplier com expressao lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, Seja bem vindo!";

    // Usar o Supplier pra obter uma lista de 5 saucações
    List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .toList();

    // Imprimir as saudações
    listaSaudacoes.forEach(s -> System.out.println(s));
    
    List<String> listaSaudacoes2 = Stream.generate(() -> "Olá, lambda, seja bem vindo!")
    .limit(3)
    .toList();
    
    listaSaudacoes2.forEach(s -> System.out.println(s));
    
  }
}
