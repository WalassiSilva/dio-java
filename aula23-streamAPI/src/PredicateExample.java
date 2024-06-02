/*Representa uma função que aceita um argumento do tipo T e retorna um boolean
 * É comumente usado para filtrar os elementos do Stream com base em alguma condição
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
  public static void main(String[] args) {
    List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

    // Criar um predicate que verifica se a palavra tem mais de 5 chars
    Predicate<String> palavraGrandes = palavra -> palavra.length() > 5;

    // Usar o Stream para filtrar as palavras com mais de 5 letras e em seguida
    // imprimir cada palavra que passou no filtro
    palavras.stream()
        .filter(palavraGrandes)
        .forEach(System.out::println);

    palavras.stream().filter(
        new Predicate<String>() {
          @Override
          public boolean test(String p) {
            return p.length() > 5;
          }
        }).forEach(System.out::println);

    palavras.stream()
        .filter(p -> p.length()< 4)
        .forEach(System.out::println);
  }
}
