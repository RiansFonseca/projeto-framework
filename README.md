# Padrão de Projeto: Decorator

## Intenção

Dinamicamente, agregar responsabilidades adicionais a um objeto. Os Decorators fornecem uma alternativa flexível ao uso de subclasses para extensão de funcionalidades. No contexto de um framework para jogos de tabuleiro, o padrão Decorator será utilizado para adicionar "Visual Addons" às peças do jogo. Isso permitirá que diferentes elementos visuais, como cores, efeitos e skins, sejam aplicados a cada peça de forma modular e independente. Por exemplo, a coroa da rainha pode ser vermelha, a crina do cavalo pode ser verde, e o movimento do peão pode ter um efeito visual específico.

## Estrutura do Padrão

A estrutura do padrão Decorator é composta pelos seguintes elementos:

- **Componente**: Define a interface ou classe abstrata que será decorada.
- **Concrete Component**: Implementa a interface do componente.
- **Decorator**: Classe abstrata que mantém uma referência ao componente e implementa a interface do componente.
- **Concrete Decorators**: Implementações específicas do decorador que adicionam funcionalidades.

## Exemplo em Código

- **Classe PecaDecorator**
@import "src\java\decorators\PecaDecorator.java"
- **Classe AdornosVermelhosDecorator**
@import "src\java\decorators\AdornosVermelhosDecorator.java"
- **Classe MovimentoComBrilhoVerdeDecorator**
@import "src\java\decorators\MovimentoComBrilhoVerdeDecorator.java"
- **Classe JogoXadrezBuilder**
@import "src\java\builders\JogoXadrezBuilder.java"


## Participantes
- **Peca**: Representa a peça do jogo.
- **PecaDecorator**: Classe base para todos os decoradores de peças.
- **AdornosVermelhosDecorator**: Decorador que adiciona adornos vermelhos à peça.
- **MovimentoComBrilhoVerdeDecorator**: Decorador que adiciona um efeito de brilho verde à peça.
- **JogoXadrezBuilder**: Builder que utiliza os decoradores para criar um jogo de xadrez.


# Padrão de Projeto: Proxy

## Intenção

O padrão Proxy tem como objetivo fornecer um substituto ou ponto de controle para acessar um objeto. Em vez de interagir diretamente com o objeto real, o Proxy atua como um intermediário, permitindo que certas verificações ou operações sejam realizadas antes de delegar a chamada ao objeto real. No contexto de um framework para jogos de tabuleiro, o padrão Proxy será utilizado para gerenciar o acesso ao **TabuleiroReal**, garantindo que certas validações, como verificar se um movimento é permitido ou se uma casa está vazia, sejam feitas antes de permitir que o jogo prossiga.

## Estrutura do Padrão

A estrutura do padrão Proxy é composta pelos seguintes elementos:

- **Subject (Interface)**: Define a interface comum usada tanto pelo Proxy quanto pelo objeto real.
- **RealSubject**: A implementação concreta do objeto real que será acessado através do proxy.
- **Proxy**: Controla o acesso ao RealSubject, adicionando verificações ou controles adicionais antes de delegar as chamadas.

## Exemplo em Código

- **Interface Tabuleiro (Subject)**
@import "src\java\proxy\Tabuleiro.java"
- **Classe TabuleiroReal (RealSubject)**
@import "src\java\proxy\TabuleiroReal.java"
- **Classe TabuleiroProxy**
@import "src\java\proxy\TabuleiroProxy.java"
- **Classe Jogo**
@import "src\java\model\Jogo.java"

## Participantes

- **Tabuleiro (Interface Subject)**: Define a interface usada por **TabuleiroReal** e **TabuleiroProxy**. Essa interface permite que ambos sejam tratados de forma intercambiável.
  
- **TabuleiroReal (RealSubject)**: A implementação concreta do tabuleiro, responsável por armazenar as peças e realizar movimentos sem realizar verificações adicionais. O **TabuleiroReal** é onde a lógica principal de movimentação das peças está localizada, porém, ele não realiza nenhuma validação por conta própria.
  
- **TabuleiroProxy (Proxy)**: Implementa a interface **Tabuleiro** e age como intermediário entre o jogo e o **TabuleiroReal**. Ele realiza verificações, como verificar se a casa de origem tem uma peça ou se a casa de destino está ocupada, antes de delegar a operação ao **TabuleiroReal**.

- **Jogo**: O contexto em que o Proxy é utilizado para gerenciar o tabuleiro. Ao invés de interagir diretamente com o **TabuleiroReal**, o **Jogo** interage com o **TabuleiroProxy**, que se encarrega de fazer as validações necessárias.


# Padrão de Projeto: Facade

## Intenção

O padrão Facade fornece uma interface simplificada para um conjunto de interfaces em um subsistema, tornando o subsistema mais fácil de usar. O objetivo é desacoplar o cliente do sistema complexo, fornecendo uma interface única que reúne funcionalidades e reduz a quantidade de chamadas diretas ao sistema. No contexto de um framework para jogos de tabuleiro, o padrão Facade será utilizado para gerenciar a criação e o término de jogos, como Xadrez e Damas, encapsulando a lógica necessária em uma única classe, permitindo que o cliente interaja de forma simples e direta.

## Estrutura do Padrão

A estrutura do padrão Facade é composta pelos seguintes elementos:

- **Facade**: Classe que fornece uma interface simplificada para o cliente, orquestrando as chamadas para as fábricas e outras classes necessárias.
- **Subsistemas**: Conjunto de classes que realizam a lógica do sistema, que o Facade encapsula.

## Exemplo em Código

- **Classe JogoFacade**
@import "src\java\facade\JogoFacade.java"

- **Classe DamasFactory**
@import "src\java\factory\JogoDamasFactory.java"

- **Classe XadrezFactory**
@import "src\java\factory\JogoXadrezFactory.java"

- **Classe Cliente**
@import "src\java\cliente\Cliente.java"

## Participantes

- **JogoFacade**: Classe que fornece métodos para iniciar e terminar partidas de Xadrez e Damas, encapsulando a lógica necessária para interagir com as fábricas e o logger.
- **JogoLogger**: Classe responsável por registrar eventos do jogo, como o início e o término de partidas.
- **JogoDamasFactory**: Fábrica responsável por criar jogos de Damas, delegando a criação a um construtor específico.
- **JogoXadrezFactory**: Fábrica responsável por criar jogos de Xadrez, delegando a criação a um construtor específico.
- **Cliente**: Classe que utiliza o Facade para iniciar um jogo e controlar o tempo de partida, sem precisar interagir diretamente com as fábricas ou a lógica do jogo.
