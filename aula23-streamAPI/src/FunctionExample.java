/*Representa uma função que aceita um argumento do tipo T e tem retorno tipo R.
 * É utilizada para tranformar os elementos do Stream em outros valores ou tipos
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
  public static void main(String[] args) {
    // Criar um lista de Int
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

    // usar Function com lambda pra dobrar todos os numeros
    Function<Integer, Integer> dobrar = numero -> numero * 2;

    // Usar a funçãO para dobrar todos os numeros no Stream e armazena-los em outra
    // lista
    List<Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
        .toList();

    // Imprimr a lista de numeros dobrados
    numerosDobrados.forEach(n -> System.out.println(n));
  }

}
