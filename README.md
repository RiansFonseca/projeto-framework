# Padrão de Projeto: Builder

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



@import "src/java/ClasseA.java"
