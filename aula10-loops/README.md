# Loops 
<details>
<summary>For</summary>

Esse comando permite que um bloco de comando seja executado enquanto uma condição seja verdadeira.

A estrutura dele é:

`for ( bloco de inicialização; expressão booleana de validadção; bloco de atualização) {}`

`for(int i = 0; i > array.lenth(); i ++) {}`

- Primeiro declaramos a variável contadora (`i`).
- Segundo deramos a condição de parada do loop, para que não rode infinitamente.
- Por fim, colocamos a regra de incremento do contador, para que saia do loop eventalmente. Essa regra pode ser de incremente ou decremento.

exemplo: 
```
public class ForLoop {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " Carneirinho");
        }
    }
}

```

### Podemos usar o for para arrays
É uma das formas mais usadas.
Onde a expressão booleana esta atrelada a um array.
exemplo:

```
String alunos[] = { "Ana", "Bruno", "Catia", "Danilo", "Estela", "Fabiana", "Gustavo" };

for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno de index " + i + " é: " + alunos[i]);
        }

```

### Foreach
 Foreach esta fortemente relacioando com um senário onde contenha um array e assim, a iteração é baseada aos elementos desse arrau/coleção.
 
 É uma forma reduzida de fazer o loop padrão
Exemplo: 
```
String alunos[] = { "Ana", "Bruno", "Catia", "Danilo", "Estela", "Fabiana", "Gustavo" };

for( String aluno : alunos){
    System.out.println("Aluno: "+ aluno);
}
```

</details>

<details>
<summary>Break e Continue</summary>

Break vai parar a execução de um bloco de comando, parar o loop.
Continue vai interromper somente a iteração atual do loop.

```
public class BreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.println(i);
        } // resultado : 1 e 2

         for (int i = 1; i <= 5; i++) {
            if(i == 3) continue;
            System.out.println(i);
        } // resultado : 1, 2, 4, 5
    }
}

```

</details>


<details>
<summary>While</summary>

O while determina que, enquanto uma condição for válida, o bloco de código será executado. 

o While testa a condição antes de executar o código, ou seja, se a condição for falsa de primeira, o bloco nem será executado.

```
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
            valorDoce = mesada;
            System.out.println("Valor do doce: " +valorDoce );
            mesada -= valorDoce;
        }
        System.out.println("Mesada: " + mesada);       
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}

```
</details>


<details>
<summary>Do While</summary>

`Do While` é muito semelhante ao While, porém ele tem detalhe, a execução é feita antes da condição, dessa forma, se o caso for falso na primeira iteração, o código será executado pelo menos uma vez.

</details>