# Operadores

<details>

<summary>Operadores</summary>

São simbolos especiais que tem um significado próprio para a liguagem e estão associados a determinadas operações.

<details>

  <summary>Operadores de atribuição</summary>

Represendado pelo símbolo de igualdade `=`.
exemplos de atribuições juntamente com alguns tipos não primitivos:

```java
String nome = "José";
int idade = 25;
double peso = 59.70;
char sexo = 'M';
boolean doadorDeSangue = true;
Date dataNascimento = new Date();
```

Este operador é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável.

 </details>
<details>

<summary>Operadores aritméticos</summary>

São os operadores matemáticos que conhecemos

- Adição `int adicao = 1+33;`
- Subtração `int subtracao = 32 - 12;`
- Multiplicação `int multiplicacao = 7 * 12;`
- Divisão `double divisao = 13 / 5;`
- Módulo `int modulo = 18 % 3` // Módulo é o resto da divisão
- `double resultado = (10 * 7) + (12/5);` podemos fazer operações complexas também

### Atenção

O símbolo `+` quando utilizado em strings, é feita concatenação, a junção dos textos.
Então se programa detecta que tem uma operação com numeros e string, o resultado pode ser diferente do esperado.

Alguns casos que podem acontecer:

```java
String concat = "?";

concat = 1+1+1+"1"; // resultado 31. Irá somar atá encontrar a string e fará a concatenação

concat = 1+"1"+1+1; // resultado 1111. A string faz parte da primeira operaçao, todo resto será concatenado

concat = 1+"1"+1+"1"; // resultado 1111. A string faz parte da primeira operaçao, todo resto será concatenado

concat = "1"+(1+1+1); // resultado 13. Primeiro é executado o que estiver entre parênteses e após isso identificou a string
```

</details>

<details>

<summary>Operadores unários</summary>

São aplicados juntamento com outro operador aritimético. Eles realizam alguns trabalhos básicos como incremetar, decrementar, inverter valores neméricos e booleanos.

- `+` Operador unário de valor posítivo - número são positivos explicitamente;
- `-` Operador unário de valor negativo - negativa um número ou experssão aritimética ;
- `++` Operador unário de incremento valor - incrementar 1 ao valor;
- `--` Operador unário de decremento valor - decrementar 1 ao valor;
- `--` Operador unário lógico de negação - nega/inverte o valor de uma expressão booleana;

### Atenção

Para tornar um numero negativo em positivo, multiplique-o por `-1`.

`++` e `--` podem ser feitos antes ou depois da execução "daquela linha". Segue os exemplos:

Com o incremento depois, primeiro mostrará na tela, depois será feito a operação.

- `System.out.println(5++);`
- `System.out.println(5--);`

Com o incremento antes, primeiro será feito a operação, depois mostrará o resultado

- `System.out.println(++5);`
- `System.out.println(--5);`

</details>

<details>

  <summary>Ternário</summary>

Operador ternário é uma forma resumida para definir uma condição e escolher entre dois valores, seria como um `if / else` comum.

Este é representado por `(expressão) ? <resultado para true> : <resultado para false>`.

```
int a, b;
a = 5;
b = 2;

String resultado = a == b ? "Valores iguais" : "Valores diferente"
```

</details>

<details>

<summary>Operadores Relacionais</summary>

Estes avalias a relação entre duas variáveis ou expressões:
- ` a == b` ->  A igual ao B;
- ` a != b` ->  A diferente de B;
- ` a > b` ->  A maior que B;
- ` a < b` ->  A menor que B;
- ` a >= b` ->  A maior ou igual que B;
- ` a <= b` ->  A menor ou igual que B;

Para comparar string e objects o mais indicado é usar:
```java
String nome1 = "Ana";
String nome2 = "Joy";

System.out.println(nome1.equals(nome2));
```

</details>

<details>

<summary>Operadores Lógicos</summary>

Os operadores lógicos nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões

- `&&` operador "E" / "AND". Todas precisam ser true
- `||` operador "OU" / "OR". Ao menos uma precisa ser true

Ex:
```

```

</details>

</details>
