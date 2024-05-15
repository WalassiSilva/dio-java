# Exceções

<details>
<summary>Try Catch </summary>

Try: Você coloca o código que pode gerar uma exceção dentro do bloco try. Isso permite que o Java monitore esse código para qualquer exceção que possa ocorrer durante sua execução.

Catch: Se uma exceção ocorrer dentro do bloco try, o controle é transferido para o bloco catch correspondente. No bloco catch, você pode especificar o tipo de exceção que deseja lidar e o que fazer quando essa exceção ocorrer. Você pode ter vários blocos catch para lidar com diferentes tipos de exceções.

```
try {
    // Código que pode gerar uma exceção
    int resultado = dividir(10, 0);
} catch (ArithmeticException e) {
    // Tratamento para a exceção ArithmeticException
    System.out.println("Divisão por zero não é permitida.");
}
```




</details>


<details>
<summary>Checked e Unchecked exceptions </summary>

Em Java, as checked exceptions são aquelas que o compilador requer que você trate explicitamente. Isso significa que, se você está chamando um método que pode lançar uma checked exception, você deve lidar com ela usando try-catch ou declarando que seu método também pode lançar essa exceção usando throws. O compilador verifica se você está lidando adequadamente com essas exceções em tempo de compilação.

Por outro lado, as unchecked exceptions (também conhecidas como RuntimeExceptions) são exceções que o compilador não exige que você lide explicitamente. Isso inclui situações como erros de lógica do programa (por exemplo, tentar acessar um índice inválido em um array) ou problemas de tempo de execução que geralmente indicam bugs no código. Como o compilador não obriga a tratar essas exceções, se elas ocorrerem em tempo de execução e não forem tratadas, o programa pode lançar uma exceção não capturada e parar de funcionar.

Em resumo, checked exceptions são verificadas em tempo de compilação e exigem tratamento explícito, enquanto unchecked exceptions são exceções que o compilador não verifica e que podem causar problemas em tempo de execução se não forem tratadas corretamente.

</details>

