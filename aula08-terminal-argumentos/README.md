# Terminal e Argumentos

<details>
<summary>Executar projeto fora da IDE</summary>


Vamos aprender como rodar o projeto foda da IDE, afial o nosso cliente não precisa ter uma ide pra usar o projeto.

Note que nosso projeto tem uma pasta `.bin`.
Essa pasta contem nossas classes `App.class`. É esse arquivo que iremos executar.

- Abra um terminal
- coloque o caminho da pasta bin
- execute `java <nome da classe>`

```java
cd C:\DEV\cursos\java\dio-java-basico\aula8-terminal-argumentos\bin
```

```java
java MinhaClasse
```

Obs: o vsCode já mantem o a compilação sempre atualizada com o projeto
Em outros lugares é necessario fazer o fluxo:
- Criar classe
- Compilar
- Executar
</details>

<details>
<summary>Argumentos</summary>

quando executamos uma classe que contenha o método `main`, o mesmo nos permite que passemos um array[] de argumentos do tipo string.
Logo, podemos informar esses parâmetro após a definição da classe 

obs: Para executar no terminal, iremos colocar os argumentos logo apos `java <nome da classe>`. Assim:

`java About Walassi Silva 26 1.77`

### Inserir parâmetros via terminal intregado do VsCode

Para que não precisemos inserir vários dados em toda execução do projeto, iremos fazer uma inserção direta com dados fixos 
 - Aba `run`
 - open configurations
 - inserir os dados no launch.json
 ```
    "args":[
                "walassi",
                "silva",
                "26",
                "1.77"
            ],
 ```
 - Executar o projeto via botão `run`

</details>

<details>
<summary>Scanner</summary>
Até o momento, as informações foram passadas via argumentos. Aprenderemos como fazer de uma forma mais segura, interativa usando Scanner.

A classe Scanner permite que o usuário tenha uma interação mais assertiva com nosso programa. Veja:



</details>