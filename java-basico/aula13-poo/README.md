# POO

<details>

<summary>Conceito de POO</summary>

Primeiro temos o que são linguagues de alto e baixo nível:
- Baixo nível: são linguagens que estão mais proximas da interpretação da máquina diante do algoritmo desenvolvido.
ex: Assembly e C.
Alto nível: São linguagues que disponibilizam uma proposta de sintaxe (forma de escrever o código para ser executaod pelo computador) mais proxima da interpretação humana.
Ex: Java, JavaScrip, Python, C#...

### Exemplo de alto e baixo nível
 Veja como um simples `Hello World` fica diferente

 - Assembly: 
 ```assembly
  section .text 
  
    global _start
  
  _start: 

  mov edx, len

  mov ecx, msg

  mov ebx, 1

  mov eax, 4

  int 0x80

  mov eax, 1

  int 0x80

  section .data 

  msg db 'Hello, World!', 0xa

  len equ $ - msg

 ```
 - Python: 
 ```python
 print('Hello, World!')
 ```

### Programação estruturada
É um paradigma de programação que visa melhorar a clareza, qualidade e o tempo de desenvolvimennto de um programada de computador, fazendo uso extensivo das construções de fluxo, condicionais, repetições, estrutura de blocos e sub rotinas.

## Prgramação Orientada a Objetos
É um paradigma baseano do conceito de objetos, que podem conter dados na forma de campos, também conhecidos como atributos, e códigos na forma de procediementos, também conhecidos como métodos.

Isso nos proporciona que façamos programas que de adequam ao cenário de mundo real, mais proximo de fluxos comportamentais, logo tudo ao nosso redor é representado como objeto

 Enquanto a programação estruturada é voltada a procedimentos e funções definidas pelo usuário, a POO é voltada para conceitos como o de classes e objetos.


</details>
<details>

  <summary>Classes</summary>

Toda a estrutura de códig em Java é distribuido em arquivo .java denominados de classes.

Classes são estruturas que direciona a criaão dos objetos do mesmo tipo compostas por: 
- Identificador: Proposito existencial ao objetos que serão criados.
- Caracteristicas: São atributos/ propriedades. É toda informação que representa o estado do objeto.
- Comportamentos: São os metodos/funções que define toda parte comportamental que um objeto dispõe.
- Instaciar: É o ato de cirar um objeto a partir da estrutura definida em uma classe.


```
public class Studend{
  String nome;
  int age;
  Color color;
  Sex sex;

  void eating(Food food){
    //TODO
  }

  void drinking(Eat eat){
    //TODO
  }

  void studyind(){
    //TODO
  }

}
```
```
public class School{
  public static void main(String[] args){

    Student student1 = new Student("John", 12 Colo.FAIR, MALE);

    Student student2 = new Student();
    student2.name = "Sophia";
    student2.age = 10;
    student2.color= Color.FAIR;
    student2.sex = Sex.FEMALE;
    
    Student student3 = new Student();
    student3.name = "Lily";
    student3.age = 11;
    student3.color= Color.DARK;
    student3.sex = Sex.FEMALE;
  }
}
```
### Convenções de classes
- Classe de modelo(model): classes que representa estrutura de domínio da aplicação, exemplo: Cliente, Pedido, NotaFiscal...
- Classe de serviço(service): Classes que contém regras de negócio e validação de nosso sistema.
- Classe de repositorio(repostory): Classes que contém uma integração com banco de dados.
- Classe de controler(controller): Classes que possue a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo `http` `web` ou `webservices`.
- Classe utilitária(util): Classe que contém recursos comuns à toda nossa aplicação.

Exercite a distribuição de classes por papéis dentro da sua aplicação, para que se possa determinar a estrutura mais conveniente em casa arquivo do seu projeto.

 </details>
<details>

<summary>Pacotes</summary>
Resumo sobre Packages em Java
Packages em Java são mecanismos que agrupam classes, interfaces e sub-packages relacionados. Eles ajudam a organizar o código, evitar conflitos de nomes e controlar o acesso às classes. Um package é definido utilizando a palavra-chave package no início de um arquivo de código-fonte.

Benefícios dos Packages
Organização: Facilita a organização das classes em uma estrutura de diretórios lógica.
Evitar Conflitos de Nomes: Permite que classes com o mesmo nome possam coexistir em programas diferentes, desde que estejam em packages diferentes.
Controle de Acesso: Controla a visibilidade das classes e membros usando modificadores de acesso (public, protected, default, private).
Criação e Utilização de Packages
Definindo um Package:
Para definir um package, adicione a declaração package no topo do arquivo .java.


```java
package com.exemplo.minhapackage;

public class MinhaClasse {
    public void meuMetodo() {
        System.out.println("Olá, Pacote!");
    }
}
```
Estrutura de Diretórios:
A estrutura de diretórios deve corresponder à hierarquia do package. Para o exemplo acima, o arquivo MinhaClasse.java deve estar no diretório com/exemplo/minhapackage.

Importando Classes de Outros Packages:
Para usar uma classe de outro package, use a palavra-chave import.

```java
import com.exemplo.minhapackage.MinhaClasse;

public class Teste {
    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse();
        obj.meuMetodo();
    }
}
```
Package Padrão:
Se uma classe não declara um package, ela pertence ao package padrão. É geralmente uma prática ruim usar o package padrão para classes que fazem parte de projetos maiores.

Exemplo Completo
Estrutura de Diretórios:

```css
src/
├── com/
│   └── exemplo/
│       └── minhapackage/
│           └── MinhaClasse.java
└── Teste.java
```
Arquivo MinhaClasse.java:

```java
package com.exemplo.minhapackage;

public class MinhaClasse {
    public void meuMetodo() {
        System.out.println("Olá, Pacote!");
    }
}
```
Arquivo Teste.java:

```java
import com.exemplo.minhapackage.MinhaClasse;

public class Teste {
    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse();
        obj.meuMetodo();
    }
}
```
Considerações Finais
Packages são uma parte fundamental da organização de projetos em Java, especialmente à medida que eles crescem em tamanho e complexidade. Utilizar uma convenção de nomenclatura adequada e manter uma estrutura de diretórios limpa pode melhorar significativamente a manutenção e a legibilidade do código.

### 


```

```

</details>
<details>

<summary></summary>


### 


```

```

</details>
<details>

<summary></summary>


### 


```

```

</details>
<details>

<summary></summary>


### 


```

```

</details>

