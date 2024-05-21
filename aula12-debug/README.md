# Debug
Erros de programação são chamados de bugs, e o processo de econtrar e corrigir bugs é chamado de Debugging / depuração.

Existem duas grandes categorias que emglobam a natureza do erro:

## Erros de Sintaxe:
É um erro nas regras estabelecidas da linguagem:
- Parênteses, chaves, colchetes que abrem e não fecham;
- Duas intruções sem ponto e virgula entre elas;
- Uma palavra chave sendo usada numa posição inesperarda;

## Erros de Semântica:
É um erro na "lógica do código", em sua semântica, o código esta sintaticamente correto, porêm não faz o que se espera dele.
- Tentar dividir numéros por strings ou por zero;
- Atribuir um valor incoerente a um tipo de dado. (`int n = "Jozé";`);
- Tentar fechar um arquivo que não foi aberto

## Debugging
Linguagem de alto nível tornam essa tarefa mais fácil, pois fornecem mais ferramentas para identificar erros, como o tratamento de exceções.

Os depuradores funcionam assumindo o controle do tempo de execução de um programa e permitinhdo que você o observe e controle. Para isso, é mostrado o fluxo e você pode controlar a direção do mesmo.
Pelo debugging, você tem uma imagem muito mais completa de um quadro de pilha do que quando olha os rastreadores de pilha em uma mensagem de log.

## Pilha de Execução de um Programa Java/Stack Trace
 ### Pilha de Execução
 Toda invocação de método é empilhada em uma estrutura de dados que isola a área de memória de cada um.
 Quando um método termina (retorna), ele volta para o método que o invocou.

 ### Stack Trace
  É a matriz onde encontramos a pilha de execução da exceção. Em outras palavras, o rastreamento da pilha busca (rastreia) para a próxima linh on de a exceção pode surgir.

  ```java
  public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciou do programa no método main.");
        a();
        System.out.println("Finalizou o programa no método main.");
    }

    static void a() {
      System.out.println("Entrou no método a.");
      b();
      System.out.println("Finalizou metodo a.");
    }
    static void b() {
      System.out.println("Entrou no método b");
      for (int i = 0; i <=4 ; i ++) System.out.println(i);
      c();
      System.out.println("Finalizou o médoto b.");
    }

    static void c(){
      System.out.println("Entrou no método c.");
      // Thread.dumpStack();
      System.out.println("Finalizou o método c.");
    }
}

  ```