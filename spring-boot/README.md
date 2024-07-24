# SpringBoot

<details>
<summary>Introdução</summary>

Spring Frameword é baseado no padrão de injeção de dependências.
SpringBoot por sua vez, foma na configuração automática, focar na produtividade.

### Desafios Antes do springboot

- Dependências individual
- Verbosidade
- Incompatibilidade de versões
- Complexidade de gestão
- Configurações complexas e repetitivas

### Starters

Starter são descritores de dependências.
Visto que a maior parte das configurações iniciais necessárias são basicamentes iguais entre os projetos, por que não iniciar um projeto com isso ja definido?

### Beneficios

- Coesão
- Versões compatíveis
- Otimização do tempo
- Configuração simples
- Foco no negócio

  **Exemplo de starters**

- data-jpa: Integração ao banco de dado via JPA - Hibernate.
- data-mongodb: Interação com banco de dados MongoDB.
- web: Inclusão do container Tomcat para aplicações REST.
- web-services: WebServices baseados na arquitetura SOAP.
- batch: Implementação do JOBs de processos.
- test: Disponibilização de recurso para testes unitarios com JUNIT
- openfeign: Client HTTP baseado em interfaces
- actuator: Gerenciamento do monitoramento da aplicação
</details>

<details>
<summary>Primeiros Passos</summary>
- Criar um projeto com initializr
- Importar o projeto com maven
- Conhecer a strutura spring boot
- Bean e CommandLineRunner

### Exemplo

Com o uso do springBoot, não temos mais a instanciação de components da forma `Item item = new Item();`

Veja como fica:

```java

// PrimeirosPassosApplication.java
@SpringBootApplication
public class PrimeirosPassosApplication {

  public static void main(String[] args){
    SpringApplication.run(PrimeirosPassosApplication.class, args);
  }
}
```

```java
// MyApp.java

@Component
public class MyApp implements CommandLineRunner {
  @Autowired
  private Calculadora calc;

  @Override
  public void run(String... args) throws Exection {
    System.out.println("RESULTADO": calc.soma(2,7));
  }
}
```

```java
//Calculadora

@Component
public class Calculadora {
  public int somar(int a, int b) {
    return a + b;
  }
}
```

</details>

<details>
<summary>Beans X Components</summary>

Pode-se dizer que tudo é beans dentro de um container springboot, pois são objetos gerenciados pelo container.
Quando deve-se usar @Bean e @Component?

## Components

Usamos quando são componentes que serão escaneados na aplicação. Quanto temos acesso ao código fonte.
Assim, podemos injetá-lo dentro de qualquer ecossistema do springboot

## Bean

Basicamente e de forma rasa, quando for um codigo externo.

```java
@Beam
public CommandLineRunner run()
```
O CommandLineRunne é uma implementação feito por nós usuarios. é um codigo externo.

</details>
