/*
 * Representa uma operação que aceita um argumento do tipo T e não retorna nunhum resultado.
 * É utilizado principalment para realizar ações, ou efeitos colaterias nos elementos do Stream sem modificar ou retornar um valor
 */

import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class ConsumerExample {
  public static void main(String[] args) {
    // Criar uma lista de int
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

    // Usar o Consumer com expresssao lambda para imprimir numeros pares
    /*
     * Consumer<Integer> imprimirPares = numero -> {
     * if (numero % 2 == 0) {
     * System.out.println(numero);
     * }
     * };
     * 
     * // usar o consumer pra imprimir numeros pares do Stream
     * numeros.stream().forEach(imprimirPares);
     */

    /*
     * numeros.stream().forEach(new Consumer<Integer>() {
     * 
     * @Override
     * public void accept(Integer n) {
     * if (n % 2 == 0) {
     * System.out.println(n);
     * }
     * }
     * });
     */

    // USANDO LAMBDA
    // numeros.forEach(n -> {
    //   if (n % 2 == 0) {
    //     System.out.println(n);
    //   }
    // });

    // LAMBDA COM PREDICATE
    numeros.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);

  }
}