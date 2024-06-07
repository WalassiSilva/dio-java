# Getters e Setters em Java

Getters e setters são métodos utilizados para acessar e modificar os atributos privados de uma classe. Eles seguem convenções específicas de nomenclatura e são essenciais para o encapsulamento em Java.

## Getter

- **Descrição:** Um método que retorna o valor de um atributo.
- **Nomenclatura:** O nome do método começa com "get" seguido do nome do atributo com a primeira letra maiúscula.
- **Exemplo:**
  ```java
  public class Pessoa {
      private String nome;

      // Getter para o atributo 'nome'
      public String getNome() {
          return nome;
      }
  }

  ```

  ## Setter
- **Descrição:** Um método que define ou atualiza o valor de um atributo.
- **Nomenclatura:** O nome do método começa com "set" seguido do nome do atributo com a primeira letra maiúscula.
- **Exemplo:**

  ```java
    public class Pessoa {
        private String nome;

        // Setter para o atributo 'nome'
        public void setNome(String nome) {
            this.nome = nome;
        }
    }

  ```

### Benefícios do Uso de Getters e Setters
- **Encapsulamento:** Protegem os atributos, permitindo o controle sobre como são acessados e modificados.
- **Validação:** Possibilitam a adição de lógica de validação ao definir novos valores para os atributos.
- **Manutenção:** Facilitam a manutenção e a leitura do código, tornando-o mais modular e compreensível.

- **Exemplo:**

  ```java
  public class Pessoa {
      private String nome;
      private int idade;

      // Getter para 'nome'
      public String getNome() {
          return nome;
      }

      // Setter para 'nome'
      public void setNome(String nome) {
          this.nome = nome;
      }

      // Getter para 'idade'
      public int getIdade() {
          return idade;
      }

      // Setter para 'idade'
      public void setIdade(int idade) {
          if (idade > 0) {
              this.idade = idade;
          } else {
              System.out.println("Idade deve ser positiva.");
          }
      }
  }
  ```