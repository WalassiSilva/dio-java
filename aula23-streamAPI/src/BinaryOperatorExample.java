/*Representa uma operaçao que combina dois args do mesmo tipo T e retorna um T.
 * É usada pra realizar operações de redução em pares de elementos, como somar numeros ou combinar objetos
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

  public static void main(String[] args) {
    // Criar listra de int
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

    // Usar binary com expressao para somar dois numros inteiros
    BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

    // Usar o BynaryOperator para somar todos os numeor do stream
    int resultado = numeros.stream()
        .reduce(0, somar);

    // Imprimir resultado da soma
    System.out.println("A soma dos numeros é: " + resultado);

    // Implementação completa
    int resultado1 = numeros.stream()
        .reduce(0, new BinaryOperator<Integer>() {
          @Override
          public Integer apply(Integer n1, Integer n2) {
            return n1 + n2;
          }

        });
    System.out.println("A soma dos numeros é: " + resultado);

    /*------------------------------- */

    // Binary com reference e lambda
    // BinaryOperator<Integer> somar2 = Integer::sum;
    int resultado2 = numeros.stream()
        .reduce(0, Integer::sum);
        System.out.println("Refatorado " + resultado2);

  }
}
