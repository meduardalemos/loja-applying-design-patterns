# Projeto de Gestão para Loja

## Alura - Curso Design Patterns em Java I: Boas práticas de programação
O projeto de gestão dessa loja foi desenvolvido durante o curso de Design Patterns em Java I: Boas práticas de programação da Alura ministrado pelo Professor Rodrigo Ferreira.
Durante o curso foram abordados 06 padrões entre os behavioral patterns.

### Design Patterns abordados:
1. **Strategy Pattern:**
  <br>Permite alternar entre diferentes algoritmos (estratégias) de forma dinâmica para realizar uma tarefa específica.
  Define uma família de algortimos em classes separadas que podem ser trocados sem afetar o código cliente.
  Foi utilizado para definir o cálculo de acordo com o tipo de imposto.
2. **Chain of Reponsibilty Pattern:**
  <br>Indicado para quando temos uma série de objetos que podem tratar uma determinada requisição.
  Cada objeto na cadeia pode tratar a requisição ou passá-la para o próximo objeto na cadeia.
  Foi utilizado definir que descontos poderiam ser aplicados a cada orçamento.
3. **Template Method Pattern:**
  <br>Define a estrutura de um algortimo em uma classe base, permitindo que as subclasses implementem partes específicas desse algoritmo.
  Foi utilizado através da criação do método `deveAplicar` na classe abstrata `Desconto`.
  O código que verifica se o desconto deve ser aplicado foi extraído para a classe mãe, evitando duplicação de código nas classes filhas e cada um delas implementa apenas a parte específica do cálculo do desconto.
4. **State Pattern:**
   <br>É recomendado para casos em que temos algortimos que dependem do estado atual de determinado objeto, assim como as regras para transição entre esses estados.
   Foi utilizado para definir o cálculo desconto com base no estado do orçamento. 
6. **Command Pattern:**
   <br>Indicado para encapsular uma solicitação como um objeto, permitindo a parametrização de clientes com diferentes solicitações, o enfileiramento de solicitações e a implementação de operações revesíveis.
   Esse design pattern foi utilizado através da criação da classe `GeradorPedidoDados`que possui as informações necessárias para a criação de um `Pedido` e da classe `GeradorPedidoHandler` que possui
    um método `executa()` onde se encontra a lógica para a criação do `Pedido`.
8. **Observer Pattern:**
   <br>É um padrão de projeto que permite o desacoplamento da comunicação entre objetos em uma relação um-para-muitos, através da criação de classes Observer
   que são notificadas da mudança de estado do objeto `pedido`. Ao serem notificadas da criação de um pedido, as ações para salvar no banco de dados e enviar
   e-mail com o pedido são disparadas.
