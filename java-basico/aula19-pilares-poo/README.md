# Os Quatro Pilares da Programação Orientada a Objetos (POO)

A Programação Orientada a Objetos (POO) é um paradigma de programação que se baseia em quatro pilares fundamentais: Abstração, Encapsulamento, Herança e Polimorfismo. Vamos explorar cada um deles:

## 1. Abstração
- **Definição**: A abstração é o processo de simplificação de um sistema complexo, focando apenas nos detalhes essenciais que são relevantes para o contexto atual, e ocultando os detalhes de implementação.
- **Exemplo**: Considere um objeto "Carro". A abstração envolve definir as características essenciais, como marca, modelo e cor, e as funcionalidades como acelerar e frear, sem se preocupar com como o motor funciona internamente.

## 2. Encapsulamento
- **Definição**: O encapsulamento é o mecanismo de esconder os dados internos de um objeto, expondo apenas o que é necessário através de métodos públicos. Isso protege o estado interno do objeto de modificações indevidas e promove a modularidade.
- **Exemplo**: Em um objeto "ContaBancaria", os atributos como saldo são privados e só podem ser acessados ou modificados por métodos públicos como `depositar()` e `sacar()`.

## 3. Herança
- **Definição**: A herança permite que uma classe (subclasse ou classe derivada) herde atributos e métodos de outra classe (superclasse ou classe base). Isso promove a reutilização de código e a criação de uma hierarquia de classes.
- **Exemplo**: Uma classe "Veiculo" pode ter subclasses como "Carro" e "Moto" que herdam os atributos e métodos comuns de "Veiculo", mas também podem adicionar características específicas.

## 4. Polimorfismo
- **Definição**: O polimorfismo permite que um objeto seja tratado como instância de várias classes, desde que essas classes estejam relacionadas por herança. Isso possibilita o uso de uma interface comum para diferentes tipos de objetos.
- **Exemplo**: Suponha que há uma classe "Animal" com um método `emitirSom()`. Classes como "Cachorro" e "Gato" podem sobrescrever esse método para fornecer suas próprias implementações. Com polimorfismo, é possível tratar todos esses objetos como "Animal" e chamar `emitirSom()`, com cada objeto respondendo de forma diferente.

Esses pilares trabalham juntos para tornar a programação orientada a objetos um método poderoso e eficiente para o desenvolvimento de software, promovendo a reutilização de código, a modularidade e a manutenção.
