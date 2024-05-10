# Condicional 

<details>
<summary>Condicional Simples</summary>
Ocorre quando uma validação de execução de fluxo for verdadeira.
Ex: Se algo for verdade, faça isso.

```
public class CaixaEletronico {

    public static void main (String [] args){
        double saldo = 25.0;
        double valorSolicitado = 37.0;

        if(valorSolicitado < saldo) {
            saldo -= valorSolicitado;
            System.out.println("saque de: " + valorSolicitado + " efetuado ");
        }

        System.out.println("Saldo atual: " + saldo);
    }
}


```

Caso a condição seja falsa, o bloco de comando sera pulado e seguirá o fluxo
</details>

<details>
<summary>Condicional Composta</summary>

Nem sempre as condições serão apenas "faça isso, ou faça nada".
Teremos que avaliar multiplos cenários, devolver multiplas resposta
Nesse caso temos uma estrutura chamada `if/else`

```
public class CondicaoComposta {
    public static void main(String [] args) {
        int nota = 8;

        if(nota > 6 ) 
        System.out.println("APROVADO!");

        else 
        System.out.println("REPROVADO!");
    }
}

```
</details>


<details>
<summary>Condicional Encadeada</summary>

Quando é necessário mais do que checar `if/else`.
Quanto tivermos vários `ifs`

public class CondicaoEncadeada {

    public static void main(String[] args) {
        int nota = 6;

        if (nota > 6)
            System.out.println("APROVADO!");

        else if (nota > 5) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO!");
        }
    }

}

</details>

<details>
<summary>Condicional Ternária</summary>

É um forma mais resumida de fazer  `if/else`.
Também é aplicado de forma emcadeada

public class CondicaoEncadeada {

    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota > 6 ? "APROVADO" : nota > 4 ? "RECUPERAÇÃO" : "REPROVADO";

            System.out.println(resultado);
    }

}

</details>

<details>
<summary>Switch</summary>

- `Switch` tem a função de controle de fluxo, assim como o `if`.
- Avalia apenas o valor exato, e não entre valores como `if`.
- É muito mai organizada que o `if`.
- Precisa colocar o comando `break` após cada `case` para seguir o fluxo do programa.
- Usamos um `case default` para quando nenhuma das condições forem chamadas

```
public class Switch {
    public static void main(String[] args) {
        char tamanho = 'M';
        switch (tamanho) {
            case 'P':
                System.out.println("PEQUENO");
                break;
            case 'M':
                System.out.println("MÉDIO");
                break;
            case 'G':
                System.out.println("GRANDE");
                break;
        
            default: 
                
                break;
        }

    }
}
``` 

Podemos usar a falta do break ao nosso favor.
Como o switch executará todos os casos abaixo de nao tiver o break, 
usaremos pra uma situção onde os casos abaixo devam ser implementados, visando assim, não ter repetição de código


</details>