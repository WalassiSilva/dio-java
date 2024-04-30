# Métodos

### Todas as ações das aplicações são consideradas métodos.

Uma clase é definida por atributos e métodos.
Atributos em sua maioria são, variáveis de diferentes tipos e valores.
Os métodos por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.

### Criterios de nomeação de Métodos

Esses métodos nao são obrigatorios, mas é recomendável que sejam seguidos, pois é uma convenção para facilitar o trabalho de forma colaborativa.

- Deve ser nomeado como verbo
- Seguir o padrão camelCase
- Ser claro sobre o que faz

```
somar(int n1, int n2) {}

abrirConexao(){}

concluirProcesso(int id){}

findById(int id) {}

getUsers(){}
```

**Atenção**: Em Java não existem métodos globais. Todos os métodos devem SEMPRE ser definidos dentro de uma classe.

Criterio de definição de métodos

- Qual é a proposta principa do método?

  Voce de ser perguntar constantemente, até compreender a rela finalidade do mesmo.

- Qual é o tipo de retorno esperado após executar o método?

  Você deve analisar se o método será responsável por retornar algum valor ou não.

- Metodos que não retornam algum valor, são representados com a palavra `void`.
- Quais os parâmetros serão necessários para a execução do método? As vezes os métodos precisarão de arguementos como criterios para a execução.

  Ex: Encontrar alguma informação pelo `id`, seria: `findById(int id){}`

- O método possui o risco de apresentar alguma exceção? Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possivel de uma.
- Qual é a visibilidade do método? Será necessário que o metodo seja visível para toda a aplicação, somente em mesmos pacotes, através de herança, ou somente a nível da própria classe.

### Veja um exemplo de classe com seus métodos

```
public class MyClass {

  public double somar(int n1, int n2) {
    // logica - finalidade do método
    return ...; // Devolver um valor para o usuário/ aplicação
  }
```

```
  public void imprimir (String text){
    // logica - finalidade do método
    // não tem retorno
  }
```

- Tem a exceção, pois não se pode dividir um valor por 0.

```
public double dividir(int dividendo, int divisor) throws Exception{}
```

 - Métodos privados não serão visto por outras classes
```
private void metodoPrivado(){}
```
- Podemos passar parâmetro separadamente para um método
```
public void gravarCliente(String nome, String cpf, Integer idade){}
```

 - Podemos fazer de forma mais inteligente criando um objeto e passando como parãmetro
```
public void gravarCliente(Cliente cliente){}
```

- Tambem podemos fazer um método gererico gravar(){} e o parametro diz se é um cliente ou outra coisa
```
public void gravar(Cliente cliente){}

public void gravar(Fornecedor fornecedor){}
```
}

```

```
