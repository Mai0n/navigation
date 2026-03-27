# Checkpoint 1 

## Descrição do projeto

Este projeto foi desenvolvido com o objetivo de trabalhar a navegação entre telas em um aplicativo Android utilizando Jetpack Compose. A proposta não foi criar tudo do zero, mas sim evoluir um projeto já existente, adicionando novas funcionalidades relacionadas à navegação e à passagem de dados entre telas.

O aplicativo possui quatro telas principais: login, menu, perfil e pedidos. A navegação entre elas foi organizada de forma simples, permitindo que o usuário consiga se movimentar pelo app de maneira fluida. Cada tela foi separada em arquivos diferentes, o que ajuda na organização e facilita futuras alterações no código.

---

## Objetivo da prova

O principal objetivo da atividade foi aplicar, na prática, conceitos de navegação entre telas utilizando o Navigation Compose. Além disso, também foi importante entender como evoluir um projeto já iniciado, trabalhando em cima de uma base pronta e implementando melhorias de forma progressiva.

Outro ponto importante foi aprender a lidar com a passagem de parâmetros entre telas, tanto obrigatórios quanto opcionais, além de trabalhar com múltiplos dados sendo enviados ao mesmo tempo.

---

## Explicação de cada evolução implementada

A primeira evolução implementada foi a passagem de parâmetros obrigatórios na tela de perfil. Nesse caso, ao navegar para essa tela, é necessário enviar um valor, como o nome do usuário. Esse valor é recebido e exibido na tela, o que torna a aplicação mais dinâmica e personalizada.

Depois disso, foi implementada a passagem de parâmetros opcionais na tela de pedidos. Diferente da anterior, essa abordagem permite que a navegação funcione mesmo sem o envio de um valor. Quando nenhum parâmetro é passado, a aplicação utiliza um valor padrão, garantindo que a tela continue funcionando normalmente.

Na sequência, foi feita a inserção de valor em um parâmetro opcional. Isso significa que, além de ser opcional, o parâmetro pode receber valores diferentes para alterar o comportamento da tela, como aplicar um tipo de filtro específico nos pedidos.

Por fim, foi implementada a passagem de múltiplos parâmetros entre telas. Nesse caso, mais de uma informação é enviada ao mesmo tempo, como nome e idade na navegação para a tela de perfil. Isso mostrou como trabalhar com rotas mais completas e como lidar com múltiplos dados sendo recebidos na tela de destino.

Essas evoluções foram importantes para entender, na prática, como funciona a navegação no Jetpack Compose e como os dados podem ser compartilhados entre diferentes partes do aplicativo.
