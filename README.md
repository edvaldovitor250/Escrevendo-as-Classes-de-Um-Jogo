# Escrevendo-as-Classes-de-Um-Jogo

# Desafio: 

## **O Que deve ser utilizado**

- Variáveis
- Operadores
- Laços de repetição
- Estruturas de decisões
- Funções
- Classes e Objetos

## Objetivo

O objetivo é criar uma classe genérica que represente um herói de uma aventura com as seguintes propriedades:

- `nome`
- `idade`
- `tipo` (ex: guerreiro, mago, monge, ninja)

Além disso, a classe deve ter um método chamado `atacar` que atenda aos seguintes requisitos:

- Exibir a mensagem: "O {tipo} atacou usando {ataque}", onde:
  - `{tipo}` deve ser concatenado com o tipo que está na propriedade da classe.
  - `{ataque}` deve seguir uma descrição diferente de acordo com o tipo, conforme a tabela abaixo:

  - Se for um mago, o ataque deve exibir "usou magia".
  - Se for um guerreiro, o ataque deve exibir "usou espada".
  - Se for um monge, o ataque deve exibir "usou artes marciais".
  - Se for um ninja, o ataque deve exibir "usou shuriken".

## Saída

Ao final, você deve exibir uma mensagem no formato: "O {tipo} atacou usando {ataque}", por exemplo:
- "mago atacou usando magia"
- "guerreiro atacou usando espada"

Através desse código, você poderá criar heróis de diferentes tipos e fazer com que eles realizem ataques específicos, exibindo mensagens de acordo com o tipo de herói e o tipo de ataque escolhido.




## Modelo em JavaScript

![Desafio_da_dio](https://github.com/edvaldovitor250/Escrevendo-as-Classes-de-Um-Jogo/assets/116117189/f0f50cf0-3634-492f-aec4-3019ed0bd63b)


- `class Heroi`: Isso define uma estrutura chamada "Heroi" que representa um personagem de um jogo ou história.

- `constructor(nome = "Thuzz", idade = 35, tipo = "mago")`: Isso é um método especial que configura um novo herói com valores padrão, a menos que sejam fornecidos valores diferentes. Ele define as características do herói, como nome, idade e tipo.

- `atacar(ataque)`: Isso é uma ação que o herói pode realizar, como lançar um ataque. Ele recebe um argumento chamado "ataque", que descreve o tipo de ataque que o herói está realizando.

- `return O ${this.tipo} atacou usando ${ataque};`: Isso retorna uma mensagem que descreve o herói usando o tipo de ataque especificado. Por exemplo, "O Mago atacou usando bola de fogo".

- `const heroi = new Heroi()`: Aqui, criamos um objeto chamado "heroi" com os valores padrão da classe "Heroi".

- `console.log(heroi.atacar("bola de fogo"))`: Isso chama o método "atacar" do objeto "heroi" e passa "bola de fogo" como o tipo de ataque. O resultado é impresso no console, exibindo a mensagem de ataque do herói.

## Modelo em Java: 

![em_Java](https://github.com/edvaldovitor250/Escrevendo-as-Classes-de-Um-Jogo/assets/116117189/371efcf1-f033-4c09-9c08-62de43c7cb35)

- `public class Heroi {`: Isso define uma classe chamada "Heroi". Uma classe é um modelo para criar objetos com características e ações específicas.

- `String nomeHeroi = "Vitor";`, `int idadeHeroi = 30;`, `String tipoHeroi = "Ninja";`: Dentro da classe, definimos as características do herói. No código, o herói se chama "Vitor", tem 30 anos de idade e é do tipo "Ninja". Essas informações são chamadas de variáveis de instância.

- `void ataque(String ataque) {`: Aqui, definimos uma ação chamada "ataque" que o herói pode realizar. A ação recebe um argumento chamado "ataque" que descreve o tipo de ataque que o herói está realizando.

- `System.out.println("O herói do tipo " + tipoHeroi + " atacou usando " + ataque);`: Dentro do método "ataque", estamos exibindo uma mensagem no console que informa o tipo do herói e o tipo de ataque que ele está usando.

- `public static void main(String[] args) {`: Este é o método principal (main) do programa. É o ponto de entrada do programa Java.

- `Heroi h1 = new Heroi();`: Aqui, criamos um objeto da classe "Heroi" chamado "h1". Isso cria uma instância do herói com os valores padrão que definimos anteriormente.

- `h1.ataque("Espada de fogo");`: Chamamos a ação "ataque" no objeto "h1" e fornecemos "Espada de fogo" como o tipo de ataque. O método "ataque" é executado e a mensagem é exibida no console.

Em resumo, este código cria um herói chamado "Vitor" que é um "Ninja" de 30 anos de idade. Ele pode realizar uma ação de ataque e imprimir mensagens no console. O método `main` é o ponto de partida do programa, onde criamos o herói e o fazemos atacar com uma espada de fogo.
