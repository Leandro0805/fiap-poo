# Projeto Fogão

## Descrição

Este projeto foi desenvolvido em Java com o objetivo de representar um **fogão** do mundo real por meio de uma classe chamada `Fogao`.

A classe possui atributos que representam características do fogão, como seu tamanho, se está ligado e a quantidade de bocas disponíveis. Além disso, possui métodos que permitem alterar o estado do objeto de acordo com regras de negócio.

## Classe Fogao

A classe `Fogao` está localizada no pacote:

```text
br.com.fiapride.model
```

### Atributos

A classe possui os seguintes atributos:

* `tamanho`: representa o tamanho do fogão.
* `ligado`: indica se o fogão está ligado ou desligado.
* `quantidade_bocas`: representa a quantidade de bocas disponíveis no fogão.
* `bocas_acesas`: indica quantas bocas estão acesas.

## Métodos

### `ligar_fogao()`

Esse método é responsável por ligar o fogão.

Antes de alterar o estado do objeto, é feita uma validação para verificar se o fogão já está ligado.

Se o fogão já estiver ligado, uma mensagem informa que não é necessário ligá-lo novamente. Caso esteja desligado, o atributo `ligado` passa a ser `true`.

Exemplo:

```java
meuFogao.ligar_fogao();
```

### `ligar_bocas(int bocas_acessas)`

Esse método é responsável por acender uma determinada quantidade de bocas do fogão.

O método possui regras de negócio para evitar que o objeto fique em um estado inconsistente:

* O fogão precisa estar ligado para que as bocas possam ser acesas.
* A quantidade informada deve ser maior que zero.
* A quantidade informada não pode ser maior que a quantidade de bocas existentes no fogão.

Quando o valor é válido, o atributo `bocas_acesas` é atualizado.

Exemplo:

```java
meuFogao.ligar_bocas(2);
```

## Estrutura do projeto

```text
src
└── br
    └── com
        └── fiapride
            ├── main
            │   └── SistemaPrincipal.java
            └── model
                └── Fogao.java
```

