package exercices;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
// import java.util.function.Predicate;
import java.util.stream.Collectors;

//  MOSTRE A LISTA EM ORDEM NUMERICA
public class ex01 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    _01OrdenarLista(list);
    // _02SomaPares(list);
    // _03ChecarNuemrosPositivos(list);
    // _04RemoverImpares(list);
    // _05MediaAcimaDeCinco(list);
    // _06MaiorDeDez(list);

  }

  public static void _01OrdenarLista(List<Integer> list) {
    var sortedList = list.stream()
        .sorted()
        .collect(Collectors.toList());
    System.out.println(sortedList);

    System.out.println(sortedList.get(sortedList.size() -2 ));
  }

  public static void _02SomaPares(List<Integer> list) {

    BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;

    var result = list.stream()
        .filter(n -> n % 2 == 0)
        .reduce(0, somar);
    System.out.println(result);
  }

  public static void _03ChecarNuemrosPositivos(List<Integer> list) {

    var result = list.stream()
        .filter(n -> n < 0)
        .collect(Collectors.toList());

    System.out.println(result.size() > 0 ? result : "Todos os numero são positivos");
  }

  public static void _04RemoverImpares(List<Integer> list) {
    var result = list.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
    System.out.println(result);
  }

  public static void _05MediaAcimaDeCinco(List<Integer> list) {
    var result = list.stream()
        .filter(n -> n > 5)
        .collect(Collectors.toList());

    System.out.println(result);

    int avg = result.size();

    int sum = result.stream()
        .reduce(0, (n1, n2) -> n1 + n2);

    System.out.println(sum / avg);

  }

  public static void _06MaiorDeDez(List<Integer> list) {
    var result = list.stream()
        .filter(n -> n > 10)
        .collect(Collectors.toList());

    System.out.println(result.size() > 0 ? result : "Nenhum item é maior que 10");
  }

  public static void _07SegundoMaior(List<Integer> list) {
    
  }




}
