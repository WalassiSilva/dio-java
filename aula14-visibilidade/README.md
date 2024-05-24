# Modificadores de Acesso

A visibilidade de recurso da linguagem não esta associada a interface gráfica, mas sim, o que as classes conseguem acessar umas das outras.

Os modificadores de acesso em Java são utilizados para definir a visibilidade de classes, métodos e atributos. Existem quatro tipos principais:



<details>
<summary>public</summary>

- **Descrição:** Torna o membro visível para todas as classes.
- **Uso:** Pode ser aplicado a classes, métodos, construtores e atributos.
- **Exemplo:**

```java
  public class MinhaClasse {
      public int meuAtributo;
      public void meuMetodo() {
          // código
      }
  }
```

</details>

<details>

<summary>Protected</summary>

- **Descrição:** Torna o membro visível apenas para classes no mesmo pacote e subclasses.
- **Uso:** Pode ser aplicado a métodos, construtores e atributos. Não pode ser aplicado a classes (exceto classes internas).
- **Exemplo:**

```java

public class MinhaClasse {
    protected int meuAtributo;
    protected void meuMetodo() {
        // código
    }
}
```

</details>

<details>
<summary>Default</summary>
- **Descrição:** Restringe o acesso para dentro do pacote somente.
- **Uso:** Pode ser aplicado a classes, métodos, construtores e atributos.

Dentro do pacote lanchonete iremos criar dois sub-pacotes para representar a divisão do estabelecimento.
- **Exemplo**
  - lanchonete.atendimento.cozinha

  - lanchonete.area.cliente

```java
class MinhaClasse {
    int meuAtributo;
    void meuMetodo() {
        // código
    }
}

```
</details>

<details>
<summary>Private</summary>

**Descrição:** Torna o membro visível apenas dentro da própria classe.
**Uso:** Pode ser aplicado a métodos, construtores e atributos. Não pode ser aplicado a classes (exceto classes internas).
**Exemplo:**

```java
public class MinhaClasse {
    private int meuAtributo;
    private void meuMetodo() {
        // código
    }
}

```
</details>

### Tabela de Visibilidade

| Modificador  | Classe Própria | Mesmo Pacote | Subclasse (mesmo pacote) | Subclasse (pacote diferente) | Mundo |
|--------------|----------------|--------------|--------------------------|------------------------------|-------|
| `public`     | Sim            | Sim          | Sim                      | Sim                          | Sim   |
| `protected`  | Sim            | Sim          | Sim                      | Sim                          | Não   |
| *Pacote*     | Sim            | Sim          | Sim                      | Não                          | Não   |
| `private`    | Sim            | Não          | Não                      | Não                          | Não   |
